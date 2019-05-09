
package convolucao;

import vizinhanca.Coordenada;


public class CoordenadaPeso extends Coordenada {

    private final double peso;

    public CoordenadaPeso(int x, int y, double peso) {
        super(x, y);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

}
