package parcial;

public class ComisionEstandar implements EstrategiaComision {
    private static final double PORCENTAJE = 5.0;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE / 100.0;
    }
}
