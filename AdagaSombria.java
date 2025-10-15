public class AdagaSombria implements Arma {
    private double danoBase = 10;

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " ataca com a Adaga Sombria!");

        if (alvo.isDesprevenido()) {
            System.out.println("Efeito especial: Ataque Furtivo! Dano triplo!");
            alvo.receberDano(danoBase * 3);
        } else {
            alvo.receberDano(danoBase);
        }
    }

    @Override
    public String getNome() {
        return "Adaga Sombria";
    }
}
