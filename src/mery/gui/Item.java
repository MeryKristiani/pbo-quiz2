/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mery.gui;

/**
 *
 * @author Mery Chris
 */
public class Item {
    private String nama;
    private int jumlah;
    private float harga;
    
    public Item() {
        
    }

    public Item(String nama, int jumlah, float harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    public float getTotal() {
        return this.harga * this.jumlah;
    }

    @Override
    public String toString() {
        return this.nama;
    }
}