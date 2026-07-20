public abstract class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;

    }

    public void exibirStatus() {
        //Saida dos status formatada
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + this.nome); 
        System.out.println("Classe: " + this.classe); 
        System.out.println("Nível: " + this.nivel); 
        System.out.println("Pontos de Vida: " + this.pontosDeVida); 
        System.out.println("Poder Base: " + this.poderBase); 

    }

    // Classe abstrata para sobrescrita
  public abstract void usarHabilidadeEspecial();
}

