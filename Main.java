import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // Criando os Personagens (Exemplos)
    Personagem p1 = new Mago("DaviJones", 99, 100, 40.0, "Machado de chamas");
    Personagem p2 = new Guerreiro("Paolo", 17, 99, 15.0, "Espada da Morte");
    Personagem p3 = new Mago("Davi", 99, 98, 41.0, "Machado de chamas");
    Personagem p4 = new Guerreiro("Cleiton", 97, 99, 16.0, "Lamias do caos");

    // Criando dois grupos distintos
    Grupo grupoLuz = new Grupo("Defensores da Luz");
    Grupo grupoSombras = new Grupo("Aliança das Sombras");

    // Adicionando personagens aos grupos
    grupoLuz.adicionarPersonagem(p1);
    grupoLuz.adicionarPersonagem(p2);

    grupoSombras.adicionarPersonagem(p3);
    grupoSombras.adicionarPersonagem(p4);

    // Testando a listagem de personagens
    grupoLuz.listarPersonagens();
    grupoSombras.listarPersonagens();

    // O método batalhar pode ser chamado a partir de qualquer uma das instâncias de
    // Grupo
    grupoLuz.batalhar(p1, p3);
    }
}
