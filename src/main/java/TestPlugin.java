import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;
import ij.text.TextPanel;

import javax.swing.*;

public class TestPlugin implements PlugInFilter {

    ImagePlus imagePlus = new ImagePlus();

    @Override
    public int setup(String arg, ImagePlus imp) {
        imagePlus.setTitle("Test Plugin");
        showGenericDialog();

        return 0;
    }

    @Override
    public void run(ImageProcessor ip) {
    }

    private void showGenericDialog() {
        try {

            final TextPanel textPanel = new TextPanel("Title");
            textPanel.setColumnHeadings("Description	Value");
            textPanel.appendLine("hello	" + "world");

            JFrame tw = new JFrame("Test GUI");
            BoxLayout box = new BoxLayout(tw.getContentPane(), BoxLayout.Y_AXIS);
            tw.getContentPane().setLayout(box);
            tw.getContentPane().add(textPanel);
            tw.setBounds(200, 200, 350, 400);
            tw.setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
