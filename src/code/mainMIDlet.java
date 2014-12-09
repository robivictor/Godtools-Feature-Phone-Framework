package code;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

public class mainMIDlet extends MIDlet{

    public static mainMIDlet m;
    public splash mysplash = new splash();
    public static operations myOperations = new operations();
    public static contentCanvas myContentCanvas = new contentCanvas();

    public mainMIDlet() {
    m = this;
    Display.getDisplay(this).setCurrent(mysplash);
    mysplash.backToGodTools();
    }

    public void startApp() {

    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }


}
