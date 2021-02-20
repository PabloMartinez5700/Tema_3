package Modelo;

public class Heroe {
    private String nombre;
    private int ataque;
    private int velocidad;
    private int defensa;
    private int vida;
    private String apariencia;
    private Complementos complementos;
    private int vidaTotal;

    public Heroe(String nombre, int ataque, int velocidad, int defensa, int vida, String apariencia, Complementos complementos) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.velocidad = velocidad;
        this.defensa = defensa;
        this.vida = vida;
        this.apariencia = apariencia;
        this.complementos = complementos;
        this.vidaTotal = vida + complementos.getVida();
    }

    public Heroe(String nombre, int ataque, int velocidad, int defensa, int vida, String apariencia) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.velocidad = velocidad;
        this.defensa = defensa;
        this.vida = vida;
        this.apariencia = apariencia;
    }

    public Heroe(Heroe heroe) {
        this.nombre = heroe.getNombre();
        this.ataque = heroe.getAtaque();
        this.velocidad = heroe.getVelocidad();
        this.defensa = heroe.getDefensa();
        this.vida = heroe.getVida();
        this.apariencia = heroe.getApariencia();
        this.complementos = new Complementos(heroe.getComplementos());
        this.vidaTotal = heroe.getVidaTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public Complementos getComplementos() {
        return complementos;
    }

    public void setComplementos(Complementos complementos) {
        this.complementos = complementos;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public boolean estaVivo() {
        return this.vidaTotal > 0;
    }

    public int devuelveAtaqueTotal() {
        return (this.complementos  != null) ? this.ataque += complementos.getAtaque() : this.ataque;
    }

    public int devuelveVidaTotal() {
        return Math.max(this.vidaTotal, 0);
    }

    public int devuelveDefensaTotal() {
        return (this.complementos  != null) ? this.defensa += complementos.getDefensa() : this.defensa;
    }

    public int devuelveVelocidadTotal() {
        return (this.complementos  != null) ? this.velocidad += complementos.getVelocidad() : this.velocidad;
    }

    public void equiparComplemento(Complementos complemento) {
        this.complementos = new Complementos(complemento);
        this.vidaTotal = this.vida + complemento.getVida();
    }

    public boolean desiquiparComplemento() {
        if (this.complementos != null){
            this.complementos = null;
            this.vidaTotal = this.vida;
            return true;
        }
        return false;
    }

    public void restaVida(int daño) {
        if (daño > 0){ this.vidaTotal -= daño; }
    }

    @Override
    public String toString() {
        return apariencia + "\n" +
                "\n" +  ((complementos != null) ? "==============================================================================================" + "\n" :
                "========================================================================" + "\n") +
                " Nombre: " + nombre +
                " , Ataque: " + ataque +
                " , Velocidad: " + velocidad +
                " , Defensa: " + defensa +
                ((complementos != null) ? " , Vida Total: " + vidaTotal : ", Vida: " + vida) +
                ((complementos != null) ? " , Complemento: " + complementos.getNombre() : "") +
                "\n" +  ((complementos != null) ? "==============================================================================================" :
                "========================================================================");
    }
}
