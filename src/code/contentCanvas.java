
package code;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class contentCanvas extends Canvas{

   
    Image contentImage;
    int place_Y = 0; // for scroll

    //=======================
    Vector AboutTitle;
    Vector AboutContent;
    int AboutTitle_E;
    int AboutContent_E;
    
    Vector title_1;
    Vector subTitle_1a;
    Vector subTitle_1b;
    Vector content_1a;
    Vector content_1b;
    Vector title_1end;
    int title_1E;
    int subTitle_1aE;
    int subTitle_1bE;
    int content_1aE;
    int content_1bE;
    int title_1endE;

    Vector title_2;
    Vector subTitle_2a;
    Vector subTitle_2b;
    Vector content_2a;
    Image ImgContent_2b;
    Vector content_2b;
    Vector title_2end;
    int title_2E;
    int subTitle_2aE;
    int subTitle_2bE;
    int content_2aE;
    int ImgContent_2bE;
    int content_2bE;
    int title_2endE;

    Vector title_3;
    Vector subTitle_3a;
    Vector subTitle_3b;
    Vector subTitle_3c;
    Vector content_3a;
    Vector content_3b;
    Vector content_3c;
    Image ImgContent_3c;
    Vector title_3end;

    Vector title_4;
    Vector subTitle_4a;
    Vector subTitle_4b;
    Vector subTitle_4c;
    Vector subTitle_4d;
    Vector subTitle_4e;
    Vector content_4a;
    Vector content_4b;
    Vector content_4c;
    Vector content_4d;
    String content_4e;

   
    //=======================
    public contentCanvas() {
        setFullScreenMode(true);
        try {
        ImgContent_2b = Image.createImage("/img/fourlaws/sin.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

       AboutTitle = operations.wrap(mainMIDlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
       AboutContent = operations.wrap(mainMIDlet.myOperations.readFile("abt", 1), Font.getDefaultFont(), getWidth()-4);
    }

    protected void paint(Graphics g) {
      
      
           
            g.setColor(240, 240, 240); // the background
            
            g.fillRect(0, 0, getWidth(), getHeight());
            AboutTitle_E  = mainMIDlet.myOperations.drawTxt(g, AboutTitle, place_Y,0);
            AboutContent_E  = mainMIDlet.myOperations.drawTxt(g, AboutContent, AboutTitle_E,3);
            ImgContent_2bE = mainMIDlet.myOperations.drawImage(g, ImgContent_2b, getWidth()/2, AboutContent_E );
             mainMIDlet.myOperations.drawTxt(g, AboutContent, ImgContent_2bE,3);
     
       
    }

    protected void keyPressed(int keyCode) {
   
        if(getGameAction(keyCode) == DOWN){
        place_Y-=15;
        } else if(getGameAction(keyCode) == UP){
        place_Y+=15;
        }
        repaint();
    }


      public Image getScreenShot() {
  Image screenshot = Image.createImage(getWidth(), getHeight());
  Graphics g = screenshot.getGraphics();
  paint(g);
  return Image.createImage(screenshot);

} 


}
