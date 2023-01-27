public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(22);
        primeraCuenta.depositar(1000);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(22);
        segundaCuenta.depositar(500);
        System.out.println(segundaCuenta.getTitular());
        System.out.println(primeraCuenta);
    }
}
