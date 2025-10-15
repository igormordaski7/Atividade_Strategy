import java.util.Random;

public class EspadaLonga implements Arma {
    private double danoBase = 15;

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " ataca com a Espada Longa!");

        double dano = danoBase;

        // Chance de sangramento
        Random random = new Random();
        if (random.nextInt(100) < 30) { // 30% chance
            System.out.println("Efeito especial: Corte Profundo! " + alvo.getNome() + " está sangrando!");
            alvo.aplicarEfeito(new Sangramento(5, 3)); // dano 5 por 3 turnos
        }

        alvo.receberDano(dano);
    }

    @Override
    public String getNome() {
        return "Espada Longa";
    }
}
