
package ex6;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Ex6 {

    
     public static void main(String[] args) {
     
        try {
            File f = new File("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
            BufferedImage img = ImageIO.read(f);
            BufferedImage redImage = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
            BufferedImage greenImage = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
            BufferedImage blueImage = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
            int count = 0;
            for (int x = 0; x < img.getWidth(); x++) {
                for (int y = 0; y < img.getHeight(); y++) {
                    Color c = new Color(img.getRGB(x, y));
                    int rgb = img.getRGB(x, y);
                 
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                  
                    Color colorRed = new Color(r, r, r);
                    Color colorGreen = new Color(g, g, g);
                    Color colorBlue = new Color(b, b, b);
                    redImage.setRGB(x, y, colorRed.getRGB());
                    greenImage.setRGB(x, y, colorGreen.getRGB());
                    blueImage.setRGB(x, y, colorBlue.getRGB());
                    count++;
                }
            }
            File out = new File("C:\\Users\\Kaio Garcia\\Pictures\\out1.jpg");
            ImageIO.write(redImage, "JPG", out);
            out = new File("C:\\Users\\Kaio Garcia\\Pictures\\out2.jpg");
            ImageIO.write(greenImage, "JPG", out);
            out = new File("C:\\Users\\Kaio Garcia\\Pictures\\out3.jpg");
            ImageIO.write(blueImage, "JPG", out);
            //System.out.println(count);
        } catch (Exception e) {
        }
    }
    
}
