public abstract class Personagem {
    protected String nome;
    protected double vida;
    protected double mana;
    protected double forca;
    protected double destreza;
    protected double inteligencia;
    protected Arma armaEquipada;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void equiparArma(Arma arma) {
        this.armaEquipada = arma;
        System.out.println(nome + " equipou " + arma.getNome());
    }

    public void atacar(Personagem alvo) {
        if (armaEquipada != null) {
            armaEquipada.atacar(this, alvo);
        } else {
            System.out.println(nome + " não tem arma equipada!");
        }
    }

    public void receberDano(double dano) {
        vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
    }

    public void aplicarEfeito(StatusEffect efeito) {
        efeito.aplicar(this);
    }

    public String getNome() {
        return nome;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
