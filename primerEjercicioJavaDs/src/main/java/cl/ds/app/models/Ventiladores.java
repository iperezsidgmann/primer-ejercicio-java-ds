package cl.ds.app.models;

public class Ventiladores {

    private String fabricante;

    private String rgb;

    private String flujo;

    private String rpm;

    private String ruido;

    private String tamanho;

    public Ventiladores() {

    }

    public Ventiladores(String fabricante, String rgb, String flujo, String rpm, String ruido, String tamanho) {
        this.fabricante = fabricante;
        this.rgb = rgb;
        this.flujo = flujo;
        this.rpm = rpm;
        this.ruido = ruido;
        this.tamanho = tamanho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    public String getFlujo() {
        return flujo;
    }

    public void setFlujo(String flujo) {
        this.flujo = flujo;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Ventiladores{" +
                "fabricante='" + fabricante + '\'' +
                ", rgb='" + rgb + '\'' +
                ", flujo='" + flujo + '\'' +
                ", rpm='" + rpm + '\'' +
                ", ruido='" + ruido + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
