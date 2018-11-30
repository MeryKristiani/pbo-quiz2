/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mery.gui;

import java.util.ArrayList;

/**
 *
 * @author Mery Chris
 */
public class ProsesTransaksi {
    private final String kode;
    private ArrayList<Item> items = new ArrayList();
    private float total;

    public ProsesTransaksi() {
        this.kode = null;
    }

    public ProsesTransaksi(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }
    
    public void setTotal() {
        float total = 0;
        for(Item item : this.items) {
            total += item.getTotal();
        }
        this.total = total;
    }  
    
    public String Pembayaran() {
        setTotal();
        String pt = "";
        pt += "Kode\t\t : " + this.kode + "\n";
        pt += "Daftar Belanja : \n ";
        for (Item item : this.items) {
            pt += "\t" + item.getNama() + "(" + item.getJumlah() + ") : " + item.getTotal() +
                    "\n" ;
        }
        pt += "Total\t\t : " + this.total;
        return pt;
    }
}
