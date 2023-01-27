public class pruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(222);
        Cliente cliente = new Cliente();
        cliente.setNombre("Diego");
        cliente.setDocumento("fdfd343434");

        cuenta.setTitular(cliente);

        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
