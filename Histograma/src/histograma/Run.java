
package histograma;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class Run {

    
    public static void main(String[] args) {
        // TODO code application logic here
//            Histograma histRed = new Histograma("Vermelho");
//            Histograma histGreen = new Histograma("Verde");
//            Histograma histBlue = new Histograma("Azul");           
//            histRed.preencherHistogramaVermelho("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");            
//            Grafico graph = new Grafico(histRed);
//            graph.criarGrafico();
//            Grafico graph2 = new Grafico(histGreen);
//            graph2.criarGrafico();
//            Grafico graph3 = new Grafico(histBlue);
//            graph3.criarGrafico();
        HistogramaRGB histograma = new HistogramaRGB();
        histograma.preencherHistograma("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
        Grafico r = new Grafico(histograma.getRed());
        r.criarGrafico();
        Grafico g = new Grafico(histograma.getGreen());
        g.criarGrafico();
        Grafico b = new Grafico(histograma.getBlue());
        b.criarGrafico();
    }
}
