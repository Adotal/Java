package area;

public class Rectangulo {

    private int base, alto, area;

    public Rectangulo(int base, int alto) {

        this.base = base;
        this.alto = alto;
    }

    public void areaCal() {
        area = base * alto;
    }

    public void Imprimir() {
        areaCal();
        System.out.println("El area del rectangulo es: " + area);
    }
}
