package com.company;

import java.util.List;

public class ProxyInternet implements ConexionInternet{
    private InternetService internetService;
    private List<String> sitiosBloqueados;

    //Constructor
    public ProxyInternet(InternetService internetService, List<String> sitiosBloqueados) {
        this.internetService = internetService;
        this.sitiosBloqueados = sitiosBloqueados;
    }


    //Sobrescribo el metodo de la interfaz
    @Override
    public void conectarCon(String url) {
        if(!this.sitiosBloqueados.contains(url)){
            this.internetService.conectarCon(url); //Utiliza el metodo de InternetService "Conectando con..."
        } else{
            System.out.println("Acceso denegado");
        }
    }
}
