package com.company;

public class Main {

    public static void main(String[] args) {
	// Instancio dos usuarios
        Usuario usuario1 = new Usuario(1,"FREE");
        Usuario usuario2 = new Usuario(2, "PREMIUM");


        DescargaSpotify proxy; //creo una variable proxy
        proxy = new ProxyDescarga(new ServicioDescarga());  //inicializo un nuevo proxy
        proxy.descargar(usuario1,"We will rock you");
        proxy.descargar(usuario2, "We will rock you");
    }
}
