public class Flor extends Planta {

    private String color_de_flor;
    private int cantidad_de_petalos;
    private String colorPistilo;
    private String variedad;
    private String estacion;

    public Flor(String nombre, double alto_tallo, boolean tieneHojas, String climaIdeal, String color_de_flor,
            int cantidad_de_petalos, String colorPistilo, String variedad, String estacion) {
        super(nombre, alto_tallo, tieneHojas, climaIdeal);
        this.color_de_flor = color_de_flor;
        this.cantidad_de_petalos = cantidad_de_petalos;
        this.colorPistilo = colorPistilo;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    public String getColor_de_flor() {
        return color_de_flor;
    }

    public void setColor_de_flor(String color_de_flor) {
        this.color_de_flor = color_de_flor;
    }

    public int getCantidad_de_petalos() {
        return cantidad_de_petalos;
    }

    public void setCantidad_de_petalos(int cantidad_de_petalos) {
        this.cantidad_de_petalos = cantidad_de_petalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void estacion(String estacion) {
        this.estacion = estacion;
    }

    public String getEstacion() {
        return estacion;
    }

    @Override
    public void decirLoQueSoy() {
        // TODO Auto-generated method stub
        System.out.println("Hola soy una flor");
    }

}
