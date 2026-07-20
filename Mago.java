public class Mago extends Personagem{
    // recebo o nome da habilidade para o mago
  String habilidade;

  public Mago(String nome, int nivel, int pontosDeVida, Double poderBase, String habilidade) {
    super(nome, "Mago", nivel, pontosDeVida, poderBase);
    this.habilidade = habilidade;
  }

  // Sobrescrevo a classe abstrata
  @Override
  public void usarHabilidadeEspecial() {
    System.out.println("Mago " + nome + " ataca com : " + habilidade);

  }
}
