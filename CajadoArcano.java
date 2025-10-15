public class CajadoArcano implements Arma {
    private double danoBase = 8;

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " lança uma Bola de Fogo com o Cajado Arcano!");
        System.out.println("Efeito especial: Queimadura!");
        alvo.aplicarEfeito(new Queimadura(10, 2)); // 10 de dano por 2 turnos
        alvo.receberDano(danoBase);
    }

    @Override
    public String getNome() {
        return "Cajado Arcano";
    }
}
