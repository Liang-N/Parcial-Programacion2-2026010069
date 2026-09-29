public class ComisionPersonalizada implements EstrategiaComision {

    private static final int CANTIDAD_LETRAS_NOMBRE = 6;
    private static final double PORCENTAJE_BASE = 5.0;

    @Override
    public double calcularComision(double montoVenta) {
        double porcentajeFinal =
                (PORCENTAJE_BASE + CANTIDAD_LETRAS_NOMBRE) / 100.0;

        return montoVenta * porcentajeFinal;
    }
}