package Retangulo;

public class Retangulo {

    public int altura;
    public int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int area() {
        return altura * largura;
    }

    public int perimetro() {
        return 2 * (altura + largura);
    }
}
