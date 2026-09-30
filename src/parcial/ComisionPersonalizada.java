package parcial;

public class ComisionPersonalizada implements EstrategiaComision {
    private static final String PRIMER_NOMBRE = "Gerson";
    private static final double PORCENTAJE = 5.0 + PRIMER_NOMBRE.length();

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE / 100.0;
    }
}
