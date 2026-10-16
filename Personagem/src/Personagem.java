public class Personagem {
    String nome;
    int vida = 100;

    void receberDano(int quantidade){
        vida = vida - quantidade;
    }

    void curar(int quantidade){
        vida = vida + quantidade;
    }
}