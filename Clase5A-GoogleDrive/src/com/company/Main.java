package com.company;

import com.company.models.Document;
import com.company.services.DocumentManagement;
import com.company.services.DocumentManager;
import com.company.services.DocumentProxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Document> documentos = new ArrayList<>();
        Document documento1 = new Document(1,"https://url1.com", "Contenido1",null);
        documento1.setUsuariosAutorizados(Arrays.asList("usuario1@gmail.com", "usuario2@gmail.com", "usuario3@gmail.com"));
        documentos.add(documento1);
        Document documento2 = new Document(2,"https://url2.com", "contenido 2", null);
        documento2.setUsuariosAutorizados(Arrays.asList("usuario4@gmail.com", "usuario5@gmail.com", "usuario6@gmail.com"));
        documentos.add(documento2);
        Document documento3 = new Document(3,"https://url3.com", "contenido 3", null);
        documento3.setUsuariosAutorizados(Arrays.asList("usuario1@gmail.com", "usuario4@gmail.com", "usuario6@gmail.com"));
        documentos.add(documento3);

        DocumentManagement proxy = new DocumentProxy(new DocumentManager(), documentos);

        proxy.getDocument("https://url3.com", "usuario1@gmail.com");
        proxy.getDocument("https://url3.com","usuario2@gmail.com");
        proxy.getDocument("https://url4.com","usuario2@gmail.com");


    }
}
