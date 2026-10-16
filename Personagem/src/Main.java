public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem1.nome = "Arthur Morgan";
        personagem2.nome = "Joel";

        personagem1.receberDano(30);
        personagem2.receberDano(50);
        personagem2.curar(20);

        System.out.println(personagem1.nome + " está com " + personagem1.vida + " de vida.");
        System.out.println(personagem2.nome + " está com " + personagem2.vida + " de vida.");

    }
}