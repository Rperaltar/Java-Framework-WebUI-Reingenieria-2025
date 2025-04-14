package videoRecorder;

import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class VideoRecorder extends ScreenRecorder {

    public static ScreenRecorder screenRecorder;
    public static String name;

    public VideoRecorder(GraphicsConfiguration cfg, File file) throws IOException, AWTException {
        super(cfg, cfg.getBounds(),
                        new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                                CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                                DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                                QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
                        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                                FrameRateKey, Rational.valueOf(30)),
                        null, file);
        VideoRecorder.name = name;
    }

    public static void startRecording() throws Exception {
        File file = new File("./videos/");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle captureSize = new Rectangle(0, 0, screenSize.width, screenSize.height);
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getDefaultScreenDevice().getDefaultConfiguration();

        screenRecorder = new VideoRecorder(gc, file);
        screenRecorder.start();
    }

    public static void stopRecording() throws Exception {
        screenRecorder.stop();
    }
}
