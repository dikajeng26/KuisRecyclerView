package com.example.Tugas3Ajeng;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.widget.ImageView;

import java.net.URI;

public class Mahasiswa {
    private String nama, panggilan;
    private Drawable gambar;

    public Mahasiswa(String nama, String panggilan, Drawable gambar) {
        this.nama = nama;
        this.panggilan = panggilan;
        this.gambar = gambar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }
}
