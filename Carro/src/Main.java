public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Corolla";
        carro2.modelo = "Civic";

        carro1.acelerar(120);
        carro2.acelerar(80);

        System.out.println("\nModelo do carro 1: " + carro1.modelo);
        System.out.println("Velocidade do carro 1: " + carro1.velocidade);

        System.out.println("\nModelo do carro 2: " + carro2.modelo);
        System.out.println("Velocidade do carro 2: " + carro2.velocidade);

    }
}
