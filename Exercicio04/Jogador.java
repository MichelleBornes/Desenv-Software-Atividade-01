public class Jogador {

    private String nome;
    private float pontuacao;
    private int nivel;

    public Jogador(String nome, float pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void mudarPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
        System.out.println("Pontuação atualizada para: " + pontuacao);
    }

    public void mudarNivel (int nivel) {
        this.nivel = nivel;
        System.out.println("Nível atualizado para: " + nivel);
    }

    public void exibirInfo() {
            System.out.println("------- Informações do Jogador -------");
            System.out.println("Nome: " + nome);
            System.out.println("Nível: " + nivel);
            System.out.println("Pontuação: " + pontuacao);
    }

}
