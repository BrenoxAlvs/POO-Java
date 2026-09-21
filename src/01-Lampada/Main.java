public class Main {

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.acende();
        lampada2.apaga();

        System.out.println(lampada1.estado);
        System.out.println(lampada2.estado);
    }
}
