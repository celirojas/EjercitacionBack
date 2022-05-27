package com.company;

public class InternetService implements ConexionInternet{
    @Override
    public void conectarCon(String url) {
        System.out.println("Conectando con " + url);
    }
}
