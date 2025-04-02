public class Main {
    public static void main(String[] args) {
        // Criando contatos
        Contato contato1 = new Contato("Ana", "1234-5678");
        Contato contato2 = new Contato("Carlos", "9876-5432");

        // Criando agenda e adicionando contatos
        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        // Exibindo todos os contatos na agenda
        System.out.println("Agenda de Contatos:");
        agenda.exibirAgenda();

        // Buscando contato por nome
        System.out.println("\nBuscando contato por nome 'Carlos':");
        Contato encontrado = agenda.buscarContatoPorNome("Carlos");
        if (encontrado != null) {
            encontrado.exibirInformacoes();
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}