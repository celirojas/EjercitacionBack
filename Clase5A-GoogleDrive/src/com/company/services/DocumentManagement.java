package com.company.services;

import com.company.models.Document; //Importamos la clase Documento

public interface DocumentManagement {
    Document getDocument(String url, String email);  //Declaramos el método para traer el documento.
}
