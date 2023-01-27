public class pruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(55);
        Cuenta cuenta2 = new Cuenta(333);
        Cuenta cuenta3 = new Cuenta(444);
        System.out.println(Cuenta.getTotal());
    }
}
