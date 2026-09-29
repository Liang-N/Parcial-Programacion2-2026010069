public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia =
                new ComisionEstandar();

        Vendedor vendedor = new Vendedor(
                "Nelson Alejandro Lopez Parada",
                1000.00,
                estrategia
        );

        vendedor.mostrarDetalle();
    }
}