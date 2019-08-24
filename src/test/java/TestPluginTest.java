import ij.ImagePlus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPluginTest {

    @Test
    void setup() {
        ImagePlus testImage = new ImagePlus();
        testImage.setTitle("Test Plugin");

        TestPlugin plugin = new TestPlugin();
        plugin.setup("", testImage);
        assertEquals(testImage.getTitle(), plugin.imagePlus.getTitle());
    }

    @Test
    void run() {
    }
}