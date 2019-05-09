
package convolucao;

import vizinhanca.Imagem;


public class Main {

    
    public static void main(String[] args) {
       
        try {
            Imagem img = new Imagem("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
            double fracao = 1.0 / 1;
            double[][] mascara = {
                {-1, -1, -1},
                {-1, 8, -1},
                {-1, -1, -1}
            };
            Mascara masc = new Mascara(mascara, fracao);
            if (masc.verificarMascara()) {

                Convolucao conv = new Convolucao(img, masc);
                conv.aplicarConvolucao();
                conv.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\out.jpg");
            } else {
                System.out.println("Máscara Inválida!");
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
        }
    }

}
