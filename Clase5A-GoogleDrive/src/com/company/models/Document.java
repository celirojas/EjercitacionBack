package com.company.models;

import java.util.List;

public class Document { //Definimos la clase documento
    private int id;
    private String url;
    private String contenido;
    private List<String> usuariosAutorizados;

    public Document(int id, String url, String contenido, List<String> usuariosAutorizados) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.usuariosAutorizados = usuariosAutorizados;
    }

    //Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<String> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }

    public void setUsuariosAutorizados(List<String> usuariosAutorizados) {
        this.usuariosAutorizados = usuariosAutorizados;
    }
}
