package com.company.services.impl;

import com.company.models.User;
import com.company.services.DownloadService;

public class DownloadManager implements DownloadService {

    @Override
    public void downloadSong(User user, String song) {
        System.out.println("El usuario " + user.getId() + " descargó la canción " + song);
    }
}
