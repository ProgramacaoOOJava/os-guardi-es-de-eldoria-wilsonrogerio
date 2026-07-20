import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Mago mago1 = new Mago("DaviJones", 99, 100, 40.0, "Machado de chamas");
    Guerreiro guerreiro = new Guerreiro("Paolo", 17, 99, 15.0, "Espada da Morte");

    // Uso das Hbilidades
    mago1.usarHabilidadeEspecial();
    guerreiro.usarHabilidadeEspecial();

    System.out.println("\n-----Polimorfismo-----");

    // Array de personagens
    List<Personagem> heroi = new ArrayList<>();
    heroi.add(new Mago("DaviJones2", 99, 100, 40.0, "Machado de chamas de paus"));
    heroi.add(new Guerreiro("Paolo2", 17, 99, 15.0, "Espada da Morte Definitiva"));

    for (Personagem p : heroi) {
      p.exibirStatus();
      p.usarHabilidadeEspecial();
      // Quebra de Linha
      System.out.println();
    }

  }
}
