public class ArcoElfico implements Arma {
    private double danoBase = 12;

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " dispara uma flecha do Arco Élfico!");
        System.out.println("Efeito especial: Chuva de Flechas!");
        alvo.receberDano(danoBase);
    }

    @Override
    public String getNome() {
        return "Arco Élfico";
    }
}
