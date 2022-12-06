package cl.ds.app.models;

public class Hdd {

    private String fabricante;

    private String tipo;

    private String rpm;

    private String tamanho;

    private String bus;

    public Hdd() {

    }

    public Hdd(String fabricante, String tipo, String rpm, String tamanho, String bus) {
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.rpm = rpm;
        this.tamanho = tamanho;
        this.bus = bus;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "fabricante='" + fabricante + '\'' +
                ", tipo='" + tipo + '\'' +
                ", rpm='" + rpm + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}
