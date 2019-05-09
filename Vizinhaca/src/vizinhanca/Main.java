
package vizinhanca;


public class Main {

    
    public static void main(String[] args) {
        try {
            Imagem img = new Imagem("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
            Vizinhanca vizinhanca = new Vizinhanca(img);
            vizinhanca.calcular4VizinhancaHorVert();
            vizinhanca.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\out.jpg");
            vizinhanca.calcular4VizinhancaDiagonal();
            vizinhanca.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\out1.jpg");
            vizinhanca.calcular8Vizinhanca();
            vizinhanca.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\out2.jpg");
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
        }
    }

}
