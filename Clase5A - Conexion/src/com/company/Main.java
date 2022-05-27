package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> sitiosBloqueados = new ArrayList<>();
        sitiosBloqueados.add("www.youtube.com");
        sitiosBloqueados.add("www.facebook.com");
        ProxyInternet proxy = new ProxyInternet(new InternetService(), sitiosBloqueados);
        proxy.conectarCon("www.youtube.com");
        proxy.conectarCon("www.google.com");
    }
}
