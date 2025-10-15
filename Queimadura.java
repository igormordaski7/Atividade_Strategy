public class Queimadura implements StatusEffect {
    private double danoPorTurno;
    private int turnos;

    public Queimadura(double dano, int turnos) {
        this.danoPorTurno = dano;
        this.turnos = turnos;
    }

    @Override
    public void aplicar(Personagem alvo) {
        System.out.println(alvo.getNome() + " está queimando!");
        for (int i = 0; i < turnos; i++) {
            alvo.receberDano(danoPorTurno);
        }
    }
}
