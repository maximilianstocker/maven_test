import ij.ImagePlus;
import ij.gui.GenericDialog;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

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
            GenericDialog dialog = new GenericDialog("Stack Selection");
            dialog.addMessage("New Message.");

            if (dialog.wasOKed()) {
                System.out.println("ok");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
