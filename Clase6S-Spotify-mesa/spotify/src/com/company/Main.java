package com.company;

import com.company.models.UserType;
import com.company.models.User;
import com.company.services.DownloadService;
import com.company.services.impl.DownloadManager;
import com.company.services.impl.DownloadProxy;

public class Main {

    public static void main(String[] args) {

        User usuario1 = new User(1, UserType.FREE);
        User usuario2 = new User(2, UserType.PREMIUM);

        DownloadService proxy = new DownloadProxy(new DownloadManager());

        proxy.downloadSong(usuario1, "lalala");
        proxy.downloadSong(usuario2, "Let It Be");

    }
}
