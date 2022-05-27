package com.company.services;

import com.company.models.Document;

public interface DocumentManagement {
    Document getDocument(String url, String mail); //Nos va a devolver el documento.
}
