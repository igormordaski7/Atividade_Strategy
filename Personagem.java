public abstract class Personagem {
    protected String nome;
    protected double vida;
    protected double mana;
    protected double forca;
    protected double destreza;
    protected double inteligencia;
    protected Arma armaEquipada;

    protected boolean atordoado = false;
    protected int turnosAtordoado = 0;
    protected boolean desprevenido = false;

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
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
    }

    public void aplicarEfeito(StatusEffect efeito) {
        efeito.aplicar(this);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtordoado() {
        return atordoado;
    }

    public void setAtordoado(boolean atordoado) {
        this.atordoado = atordoado;
    }

    public int getTurnosAtordoado() {
        return turnosAtordoado;
    }

    public void setTurnosAtordoado(int turnos) {
        this.turnosAtordoado = turnos;
    }

    public boolean isDesprevenido() {
        return desprevenido;
    }

    public void setDesprevenido(boolean desprevenido) {
        this.desprevenido = desprevenido;
    }
}
