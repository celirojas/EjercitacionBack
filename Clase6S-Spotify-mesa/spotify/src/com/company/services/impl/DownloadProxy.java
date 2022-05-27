package com.company.services.impl;

import com.company.models.UserType;
import com.company.models.User;
import com.company.services.DownloadService;

public class DownloadProxy implements DownloadService {

    private DownloadManager downloadManager;


    public DownloadProxy(DownloadManager documentManager) {
        this.downloadManager = documentManager;
    }

    @Override
    public void downloadSong(User user, String song) {

        if (user.getTipo().equals(UserType.PREMIUM)){
            this.downloadManager.downloadSong(user, song); //Si el usuario es premium le pide a downloadManager que me descargue la cancion
        }else{
            System.out.println("El usuario "+ user.getId() + " no tiene permiso para descargar esta canción.");
        }
    }
}
