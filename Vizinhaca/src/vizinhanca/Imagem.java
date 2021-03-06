
package vizinhanca;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;


public class Imagem {

    private final HashMap<String, RGB> quadro;
    private final File f;
    private final BufferedImage img;
    private final int largura;
    private final int altura;
    private final int tipo;

    public Imagem(String caminho) throws IOException {
        quadro = new HashMap<>();
        f = new File(caminho);
        img = ImageIO.read(f);
        largura = img.getWidth();
        altura = img.getHeight();
        tipo = img.getType();
        preencher();
    }

    private void adicionar(Coordenada coordenada, RGB rgb) {
        String coord = coordenada.getX() + ";" + coordenada.getY();
        quadro.put(coord, rgb);
    }

    public RGB getRGB(Coordenada coordenada) {
        String coord = coordenada.getX() + ";" + coordenada.getY();
        return quadro.get(coord);
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getTipo() {
        return tipo;
    }

    private void preencher() {
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color c = new Color(img.getRGB(x, y));
                RGB rgb = new RGB(c.getRed(), c.getGreen(), c.getBlue());
                adicionar(new Coordenada(x, y), rgb);
            }
        }
    }
}
