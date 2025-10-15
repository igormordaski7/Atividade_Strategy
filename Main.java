public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thorin");
        Mago mago = new Mago("Merlin");

        guerreiro.equiparArma(new MachadoDeGuerra());
        mago.equiparArma(new CajadoArcano());

        Batalha batalha = new Batalha(guerreiro, mago);
        batalha.iniciar();
    }
}
