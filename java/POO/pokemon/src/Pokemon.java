public abstract class Pokemon {

    protected String nombre;
    protected int nivel;
    protected int salud;
    protected String tipo;

    public Pokemon() {

    }

    public Pokemon(String nombre, int nivel, int salud, String tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void atacar() {
        System.out.println(nombre + " ataca!");
    }
}
