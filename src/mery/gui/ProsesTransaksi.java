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
}
