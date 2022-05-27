package com.company.services;

import com.company.models.Document;

import java.util.List;

public class DocumentProxy implements DocumentManagement{
    private DocumentManager documentManager; //Referencia a la clase principal
    private List<Document> documents;

    //Constructor


    public DocumentProxy(DocumentManager documentManager, List<Document> documents) {
        this.documentManager = documentManager;
        this.documents = documents;
    }

    @Override
    public Document getDocument(String url, String email) {
        Document doc = null;
        for (Document d : documents){

            if(d.getUrl().equalsIgnoreCase(url)){
                doc = d;
            };
        };
        if( doc == null){
            System.out.println("Documento no encontrado");
            return null;
        }
        if(doc.getUsuariosAutorizados().contains(email)){
            System.out.println("El usuario esta autorizado. Aguarde el documento");
            return this.documentManager.getDocument(url, email);
        } else {
            System.out.println("El usuario no esta autorizado");
            return null;
        }
    }
}
