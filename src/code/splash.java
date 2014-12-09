
package code;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class splash extends Canvas{

    public splash() {
        setFullScreenMode(true);
    }

    protected void paint(Graphics g) {
        try {
            g.setColor(170, 170, 170);
            g.fillRect(0, 0, getWidth(), getHeight());
            int i=0;
            while(i<6)
            {
                g.setColor(170 + (i*5), 170 + (i*5), 170 + (i*5));
            g.drawRect(i, i, getWidth()-(i*2), getHeight()-(i*2));
            i++;
            }
           
            g.drawImage(Image.createImage("/img/godtools_splash.png"), getWidth() / 2, getHeight() / 5, Graphics.TOP | Graphics.HCENTER);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
    public void backToGodTools()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }
     Display.getDisplay(mainMIDlet.m).setCurrent(mainMIDlet.myContentCanvas);
    }

}
