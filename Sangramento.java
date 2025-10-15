public class Sangramento implements StatusEffect {
    private double danoPorTurno;
    private int turnosRestantes;

    public Sangramento(double dano, int turnos) {
        this.danoPorTurno = dano;
        this.turnosRestantes = turnos;
    }

    @Override
    public void aplicar(Personagem alvo) {
        System.out.println(alvo.getNome() + " sofre sangramento!");
        for (int i = 0; i < turnosRestantes; i++) {
            alvo.receberDano(danoPorTurno);
        }
    }
}
