import java.util.Random;

public class MachadoDeGuerra implements Arma {
    private double danoBase = 18;

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " desfere um golpe poderoso com o Machado de Guerra!");
        alvo.receberDano(danoBase);

        Random random = new Random();
        if (random.nextInt(100) < 25) {
            System.out.println("Efeito especial: Golpe Esmagador! " + alvo.getNome() + " ficou atordoado!");
            alvo.aplicarEfeito(new Atordoado(1));
        }
    }

    @Override
    public String getNome() {
        return "Machado de Guerra";
    }
}
