public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();

        celular1.marca = "Iphone";
        celular2.marca = "Samsung";

        celular1.usar(25);
        celular2.carregar(25);

        System.out.println("Usando o " + celular1.marca + ", bateria em: " + celular1.bateria);
        System.out.println("Carregando o " + celular2.marca + ", bateria em: " + celular2.bateria);
    }
}