package com.company.services;

import com.company.models.User;

public interface DownloadService {
    void downloadSong(User user, String song); //método a implementar en la clase DownloadManager y DownloadProxy
}
