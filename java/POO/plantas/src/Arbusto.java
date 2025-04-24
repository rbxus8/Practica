public class Arbusto extends Planta {

    private double ancho_arbusto;
    private boolean esDomestico;
    private String variedad_arbusto;
    private String color_de_hojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(String nombre, double alto_tallo, boolean tieneHojas, String climaIdeal,
            double ancho_arbusto, boolean esDomestico, String variedad_arbusto, String color_de_hojas,
            boolean sePodaONo) {
        super(nombre, alto_tallo, tieneHojas, climaIdeal);
        this.ancho_arbusto = ancho_arbusto;
        this.esDomestico = esDomestico;
        this.variedad_arbusto = variedad_arbusto;
        this.color_de_hojas = color_de_hojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAncho_arbusto() {
        return ancho_arbusto;
    }

    public void setAncho_arbusto(double ancho_arbusto) {
        this.ancho_arbusto = ancho_arbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad_arbusto() {
        return variedad_arbusto;
    }

    public void setVariedad_arbusto(String variedad_arbusto) {
        this.variedad_arbusto = variedad_arbusto;
    }

    public String getColor_de_hojas() {
        return color_de_hojas;
    }

    public void setColor_de_hojas(String color_de_hojas) {
        this.color_de_hojas = color_de_hojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    // punto 3
    @Override
    public void decirLoQueSoy() {
        // TODO Auto-generated method stub
        System.out.println("Hola soy un arbusto");
    }

}
