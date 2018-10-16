package com.gmail.restujulian07.restuapp;

public class Acara {
    private String nama;
    private String tgl;
    private String ket;

    public Acara(String nama, String tgl, String ket) {
        this.nama = nama;
        this.tgl = tgl;
        this.ket = ket;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String nohp) {
        this.ket = ket;
    }
}