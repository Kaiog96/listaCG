
package limiarizacaoporotsu;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Limiarizacao {
      private final String srcPath;
    private final String outPath;

    public Limiarizacao(String srcPath, String outPath) {
        this.srcPath = srcPath;
        this.outPath = outPath;
    }

    public void converter() throws IOException {
        File f = new File(srcPath);
        BufferedImage img = ImageIO.read(f);
        BufferedImage out = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        for (int x = 0; x < img.getWidth(); x++) {
            for (int z = 0; z < img.getHeight(); z++) {
                int media = mediaRGB(new Color(img.getRGB(x, z)));
                out.setRGB(x, z, new Color(media, media, media).getRGB());
            }
        }
        File outPut = new File(outPath);
        ImageIO.write(out, "JPG", outPut);
    }

    private int mediaRGB(Color c) {
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        return (int) ((r + g + b) / 3);
}
}
