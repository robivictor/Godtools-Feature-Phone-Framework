
package code;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class menu extends Canvas{

    public menu() {
        setFullScreenMode(true);
    }

    protected void paint(Graphics g) {
        try {
            g.setColor(69, 1, 1);
            g.fillRect(0, 0, getWidth(), getHeight());           
            g.drawImage(Image.createImage("/img/godtools_splash.png"), getWidth() / 2, getHeight() / 5, Graphics.TOP | Graphics.HCENTER);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    protected void keyPressed(int keyCode) {
        super.keyPressed(keyCode);
    }

    


}
