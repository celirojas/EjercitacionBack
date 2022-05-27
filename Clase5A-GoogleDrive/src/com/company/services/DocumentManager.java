package com.company.services;

import com.company.models.Document;

public class DocumentManager implements DocumentManagement {
    Document documento;


    @Override
    public Document getDocument(String url, String email) {
        System.out.println("Trayendo el documento...");

        return documento;
    }
}
