package com.company.services.impl;

import com.company.models.Document;
import com.company.services.DocumentManagement;

public class DocumentManager implements DocumentManagement {
    Document documento;


    //Sobreescritura del método de la interface.
    @Override
    public Document getDocument(String url, String mail) {
        System.out.println("Trayendo documento...");
        return documento;
    }
}
