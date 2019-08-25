import ij.ImagePlus;
import ij.measure.ResultsTable;
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

        ResultsTable resultsTable = plugin.textPanel.getOrCreateResultsTable();
        assertEquals("world", resultsTable.getStringValue(1, 0));
    }

    @Test
    void run() {
    }
}