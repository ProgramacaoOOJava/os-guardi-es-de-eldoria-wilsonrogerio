import java.util.ArrayList;

public class Grupo {
  private String nomeGrupo;
  private ArrayList<Personagem> membros;

  // Contrutor da Classe
  public Grupo(String nome) {
    this.nomeGrupo = nome;
    // Inicializo a Lista vazia
    this.membros = new ArrayList<>();
  }

  // Getter do nome
  public String getNomeGrupo() {
    return nomeGrupo;
  }

  public void adicionarPersonagem(Personagem p) {
    membros.add(p);
  }

  public void listarPersonagens() {
    System.out.println("--- Membros do Grupo: " + nomeGrupo + " ---");
    // Loop para exibir cada personagem da lista
    for (Personagem p : membros) {
      System.out.println("- " + p.nome + " (Nível: " + p.getNivel() + ")");
    }
  }

  public void batalhar(Personagem p1, Personagem p2) {
    System.out.println("----- Inicio da Batalha -----");
    // Convercao dos valores para Inteiros
    int poderTotalP1 = (int) Math.round(p1.getNivel() * p1.getPoderBase());
    int poderTotalP2 = (int) Math.round(p2.getNivel() * p2.getPoderBase());

    System.out.println(p1.nome + " Poder total : " + poderTotalP1);
    System.out.println(p2.nome + " Poder total : " + poderTotalP2);

    if (poderTotalP1 > poderTotalP2) {
      System.out.println(p1.getNome() + " venceu !! Poder total : " + poderTotalP1);
    } else if (poderTotalP2 > poderTotalP1) {
      System.out.println(p2.getNome() + " venceu !! Poder total : " + poderTotalP2);
    } else {
      System.out.println("Houve um empate entre " + p1.getNome() + " e " + p2.getNome());
    }

    System.out.println("---- fim da batalha ----");
  }

}
