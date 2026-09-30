package parcial;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Gerson Bermudez", 1000.0);
        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
