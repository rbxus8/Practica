public abstract class Planta {

    String Nombre;
    double alto_del_tallo;
    boolean tiene_Hojas;
    String climaIdeal;

    // Constructor
    public Planta() {
    }

    public Planta(String Nombre, double alto_del_tallo, boolean tiene_Hojas, String climaIdeal) {
        this.Nombre = Nombre;
        this.alto_del_tallo = alto_del_tallo;
        this.tiene_Hojas = tiene_Hojas;
        this.climaIdeal = climaIdeal;
    }

    // Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public double getalto_del_tallo() {
        return alto_del_tallo;
    }

    public boolean gettiene_Hojas() {
        return tiene_Hojas;
    }

    public String getclimaIdeal() {
        return climaIdeal;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setalto_del_tallo(double alto_del_tallo) {
        this.alto_del_tallo = alto_del_tallo;
    }

    public void settiene_Hojas(boolean tiene_Hojas) {
        this.tiene_Hojas = tiene_Hojas;
    }

    public void setclimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public abstract void decirLoQueSoy();

}
