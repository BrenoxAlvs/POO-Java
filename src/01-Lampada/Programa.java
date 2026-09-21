public class Programa {
    public static void main(String[] args) {
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();

        porta1.abre();
        porta2.fecha();

        System.out.println(porta1.estado);
        System.out.println(porta2.estado);
    }
}
