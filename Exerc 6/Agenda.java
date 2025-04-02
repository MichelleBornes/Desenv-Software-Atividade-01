import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null caso o contato não seja encontrado
    }

    public void exibirAgenda() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            for (Contato contato : contatos) {
                contato.exibirInformacoes();
                System.out.println("-----");
            }
        }
    }
}
