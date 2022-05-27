package com.company.services.impl;

import com.company.models.Document;
import com.company.services.DocumentManagement;

import java.util.List;

public class DocumentProxy implements DocumentManagement {

    private DocumentManager documentManager; //referencia al documentManager, la clase principal.
    private List<Document> documents; //lista de documentos

    //Constructor
    public DocumentProxy(DocumentManager documentManager, List<Document> documents) {
        this.documentManager = documentManager;
        this.documents = documents;
    }

    //Sobreescritura del metodo getDocument de la interfaz
    @Override
    public Document getDocument(String url, String mail) {
        Document doc = null; //Vamos a tener que retornar un documento y si no lo encuentra, null.
        for(Document d: documents){ //Recorremos los documentos y si alguno coincide con la url que le pasamos por parámetro lo guardamos en la variable doc

            if (d.getUrl().equals(url)){
                doc = d;
            };
        };

        if (doc == null) { //Si es null imprimimos por consola que no se encontró el documento.
            System.out.println("Documento no encontrado");
            return null;
        }
        if (doc.getUsuariosAutorizados().contains(mail)){ //Si el usuario que le pasamos por parametro esta autorizado le traemos el doc, sino acceso denegado.
            return this.documentManager.getDocument(url, mail);
        }else{
            System.out.println("Acceso denegado");
            return null;
        }
    }
}
