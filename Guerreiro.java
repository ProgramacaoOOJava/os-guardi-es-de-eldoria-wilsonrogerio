public class Guerreiro extends Personagem {
    // recebo o nome da habilidade para o guerreiro
  String habilidade;

  public Guerreiro(String nome, int nivel, int pontosDeVida, Double poderBase, String habilidade) {
    super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    this.habilidade = habilidade;
  }

  // Sobrescrevo a classe abstrata
  @Override
  public void usarHabilidadeEspecial() {
    System.out.println("Guerreiro " + nome + " ataca com : " + habilidade);

  }
}
