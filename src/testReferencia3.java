public class testReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(222);
        Cliente cliente = new Cliente();
        cuentaDeDiego.setTitular(cliente);
        System.out.println(cliente);
        System.out.println(cuentaDeDiego.getTitular());

        Cliente titular = cuentaDeDiego.getTitular();

        System.out.println(titular);

        cuentaDeDiego.getTitular().setNombre("Diego");
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
}
