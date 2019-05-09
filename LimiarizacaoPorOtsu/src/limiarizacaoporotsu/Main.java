
package limiarizacaoporotsu;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
       Limiarizacao limiar = new Limiarizacao("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg",
                                              "C:\\Users\\Kaio Garcia\\Pictures\\out.jpg");
        try {
            limiar.converter();
        } catch (IOException ex) {
            System.out.println("Erro ao manipular arquivos: " + ex.toString());
        }
}
    }
    

