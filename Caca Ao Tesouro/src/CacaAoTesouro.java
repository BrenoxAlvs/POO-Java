public class CacaAoTesouro {
    private Pista primeiraPista;
    private Pista ultimaPista;

    public CacaAoTesouro() {
        primeiraPista = null;
        ultimaPista = null;
    }

    public void adicionarPista(String nomeIlha, String mensagem) {
        Pista novaPista = new Pista(nomeIlha, mensagem);

        if (primeiraPista == null) {
            primeiraPista = novaPista;
            ultimaPista = novaPista;
        } else {
            ultimaPista.setProximaPista(novaPista);
            ultimaPista = novaPista;
        }
    }

    public void iniciarJornada() {

        if (primeiraPista == null) {
            System.out.println("Nenhuma pista cadastrada.");
            return;
        }

        Pista atual = primeiraPista;

        while (atual != null) {
            System.out.println("Ilha: " + atual.getNomeIlha());
            System.out.println("Pista: " + atual.getMensagem());
            System.out.println();

            atual = atual.getProximaPista();
        }
    }

    public Pista buscarPista(String nomeIlha) {

        Pista atual = primeiraPista;

        while (atual != null) {
            if (atual.getNomeIlha().equals(nomeIlha)) {
                return atual;
            }
            atual = atual.getProximaPista();
        }
        System.out.println("Ilha não encontrada.");
        return null;
    }

    public boolean removerPista(String nomeIlha) {
        if (primeiraPista == null) {
            return false;
        }
        Pista atual = primeiraPista;
        Pista anterior = null;

        while (atual != null) {
            if (atual.getNomeIlha().equals(nomeIlha)) {
                if (anterior == null) {
                    primeiraPista = atual.getProximaPista();
                } else {
                    anterior.setProximaPista(atual.getProximaPista());
                }

                if (atual == ultimaPista) {
                    ultimaPista = anterior;
                }
                return true;
            }
            anterior = atual;
            atual = atual.getProximaPista();
        }
        return false;
    }
}