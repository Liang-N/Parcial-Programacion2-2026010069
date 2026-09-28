public abstract class Empleado {

    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    public Empleado(
            String nombre,
            double ventasMes,
            EstrategiaComision estrategia) {

        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(EstrategiaComision nueva) {
        if (nueva == null) {
            throw new IllegalArgumentException(
                    "La estrategia no puede ser nula."
            );
        }

        this.estrategia = nueva;
    }

    public abstract void mostrarDetalle();
}