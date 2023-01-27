import javax.swing.text.StyledEditorKit.BoldAction;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(22);
        miCuenta.depositar(300);
        miCuenta.depositar(200);
        System.out.println(miCuenta.getSaldo());
        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo());

        Cuenta cuentaDeJimena = new Cuenta(22);
        cuentaDeJimena.depositar(1000);

        Boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);

        if(puedeTransferir){
            System.out.println("Transferencia Exitosa");
        }else{
            System.out.println("Transferencia No Exitosa");
        }

        System.out.println(cuentaDeJimena.getSaldo());
        System.out.println(miCuenta.getSaldo());
    }
}
