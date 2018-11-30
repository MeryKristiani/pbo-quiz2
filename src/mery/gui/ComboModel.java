/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mery.gui;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mery Chris
 */
public class ComboModel {
    private HashMap<String, Float> items = new HashMap<>();
    
    public ComboModel() {
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(20000));
        this.items.put("Gula", new Float(15000));
    }
    
    public ArrayList<String> getJenisNama() {
        ArrayList<String> str = new ArrayList<>();
        for(String item : this.items.keySet()) {
            str.add(item);
        }
        return str;
    }
    
    public ArrayList<Float> getHargaBarang() {
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.items.values()) {
            flt.add(item);
        }
        return flt;
    }
    
    public void addItem(String nama, float harga) {
        this.items.put(nama, harga);
    }
}
