package model;

public class Avion {
    private Long id;
    private String marca;
    private String modelo;
    private String fechaEntrada;

    public Avion(Long id, String marca, String modelo, String fechaEntrada) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaEntrada = fechaEntrada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
}
