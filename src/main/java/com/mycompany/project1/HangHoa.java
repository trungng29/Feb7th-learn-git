/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author ADMIN
 */
public class HangHoa {
    private String mhh,bt,re;
    private int gm,gb;
    private static int id=1;

    public HangHoa(String bt, String re, int gm, int gb) {
        mhh = String.format("MH%03d", id++);
        this.bt = bt;
        this.re = re;
        this.gm = gm;
        this.gb = gb;
    }

    public String getMhh() {
        return mhh;
    }

    public String getBt() {
        return bt;
    }

    public String getRe() {
        return re;
    }

    public int getGm() {
        return gm;
    }

    public int getGb() {
        return gb;
    }
}
