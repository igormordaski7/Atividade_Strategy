public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thorin");
        Mago mago = new Mago("Merlin");

        Arma espada = new EspadaLonga();
        Arma cajado = new CajadoArcano();

        guerreiro.equiparArma(espada);
        mago.equiparArma(cajado);

        System.out.println("\n--- Início da Batalha ---\n");
        guerreiro.atacar(mago);
        mago.atacar(guerreiro);
    }
}
