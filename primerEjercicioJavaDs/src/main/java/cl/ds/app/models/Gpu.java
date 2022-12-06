package cl.ds.app.models;

public class Gpu {

    private String modelo;

    private String memoria;

    private String frecuenciaCore;

    private String frecuenciaMemoria;

    private String bus;

    private String fabricante;

    public Gpu() {

    }

    public Gpu(String modelo, String memoria, String frecuenciaCore, String frecuenciaMemoria, String bus, String fabricante) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.frecuenciaCore = frecuenciaCore;
        this.frecuenciaMemoria = frecuenciaMemoria;
        this.bus = bus;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getFrecuenciaCore() {
        return frecuenciaCore;
    }

    public void setFrecuenciaCore(String frecuenciaCore) {
        this.frecuenciaCore = frecuenciaCore;
    }

    public String getFrecuenciaMemoria() {
        return frecuenciaMemoria;
    }

    public void setFrecuenciaMemoria(String frecuenciaMemoria) {
        this.frecuenciaMemoria = frecuenciaMemoria;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "modelo='" + modelo + '\'' +
                ", memoria='" + memoria + '\'' +
                ", frecuenciaCore='" + frecuenciaCore + '\'' +
                ", frecuenciaMemoria='" + frecuenciaMemoria + '\'' +
                ", bus='" + bus + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
