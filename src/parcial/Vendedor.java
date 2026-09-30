package parcial;

public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("Empleado: " + nombre);
        System.out.printf("Venta total: $%.2f%n", ventasMes);
        System.out.printf("Comision (%s): $%.2f%n", estrategia.getClass().getSimpleName(), comision);
    }
}
