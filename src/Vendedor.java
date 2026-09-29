public class Vendedor extends Empleado {

    public Vendedor(
            String nombre,
            double ventasMes,
            EstrategiaComision estrategia) {

        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comisionObtenida =
                estrategia.calcularComision(ventasMes);

        System.out.println("DETALLE DEL VENDEDOR ");
        System.out.println("Nombre: " + nombre);
        System.out.printf("Venta total del mes: $%.2f%n", ventasMes);
        System.out.println(
                "Estrategia utilizada: "
                        + estrategia.getClass().getSimpleName()
        );
        System.out.printf(
                "Comisión obtenida: $%.2f%n",
                comisionObtenida
        );
    }
}