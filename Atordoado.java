public class Atordoado implements StatusEffect {
    private int turnos;

    public Atordoado(int turnos) {
        this.turnos = turnos;
    }

    @Override
    public void aplicar(Personagem alvo) {
        System.out.println(alvo.getNome() + " está atordoado e não poderá agir por " + turnos + " turno(s)!");
        alvo.setAtordoado(true);
        alvo.setTurnosAtordoado(turnos);
    }
}
