import java.util.Random;
import java.util.Scanner;

public class Batalha {
    private Personagem jogador1;
    private Personagem jogador2;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public Batalha(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void iniciar() {
        System.out.println("\nInício da Batalha: " + jogador1.getNome() + " vs " + jogador2.getNome() + "");

        while (jogador1.estaVivo() && jogador2.estaVivo()) {
            turno(jogador1, jogador2);
            if (!jogador2.estaVivo()) break;
            turno(jogador2, jogador1);
        }

        System.out.println("\n" + (jogador1.estaVivo() ? jogador1.getNome() : jogador2.getNome()) + " venceu a batalha!");
    }

    private void turno(Personagem atacante, Personagem alvo) {
        if (atacante.isAtordoado()) {
            System.out.println(atacante.getNome() + " está atordoado e perde o turno!");
            atacante.setTurnosAtordoado(atacante.getTurnosAtordoado() - 1);
            if (atacante.getTurnosAtordoado() <= 0) atacante.setAtordoado(false);
            return;
        }

        boolean critico = random.nextInt(100) < 15;
        if (critico) {
            System.out.println(atacante.getNome() + " realizou um ataque CRÍTICO!");
            alvo.receberDano(10);
        }

        atacante.atacar(alvo);
        System.out.println("-----------------------------");
    }
}
