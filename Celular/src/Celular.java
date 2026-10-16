public class Celular {
    String marca;
    int bateria = 50;

    void carregar(int quantidade) {
        bateria = bateria + quantidade;
    }
    void usar(int quantidade){
        bateria = bateria - quantidade;
    }
}