public class testReferencia {
    public static void main(String[] args) {
        
        Cuenta primeraCuenta = new Cuenta(22);
        primeraCuenta.depositar(200);
        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.depositar(1);

        System.out.println("Saldo primera cuenta " + primeraCuenta.getSaldo());
        System.out.println("Saldo segunda cuenta " + segundaCuenta.getSaldo());

        segundaCuenta.depositar(400);
        System.out.println("Saldo segunda cuenta " + primeraCuenta.getSaldo());
    }
}
