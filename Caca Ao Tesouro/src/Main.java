/*
Nome: Elder Breno Teixeira Alves |
Matrícula: 200040211
Nome: Andrey Rafael Ferreira de Freitas
Matrícula: 200029462
*/

public class Main {
    public static void main(String[] args) {

        CacaAoTesouro caca = new CacaAoTesouro();

        caca.adicionarPista(
                "Ilha dos Pássaros",
                "Procure pela palmeira torta na praia leste."
        );

        caca.adicionarPista(
                "Ilha da Névoa",
                "Siga o rio até a caverna; atente-se às rochas."
        );

        caca.adicionarPista(
                "Ilha do Esqueleto",
                "Cuidado com as armadilhas no caminho de pedra."
        );

        caca.adicionarPista(
                "Ilha das Sereias",
                "Navegue ao sul até encontrar o rochedo azul."
        );

        caca.adicionarPista(
                "Ilha do Baú de Ouro",
                "PARABÉNS! Você encontrou o tesouro do Capitão Morgan!"
        );

        System.out.println("=== INICIAR JORNADA ===\n");
        caca.iniciarJornada();

        System.out.println("=== SABOTAGEM ===");
        caca.removerPista("Ilha do Esqueleto");

        System.out.println("\n=== JORNADA APÓS SABOTAGEM ===\n");
        caca.iniciarJornada();

        System.out.println("=== BUSCA PELO TESOURO ===");

        Pista tesouro = caca.buscarPista("Ilha do Baú de Ouro");

        if (tesouro != null) {
            System.out.println(tesouro.getMensagem());
        }
    }
}