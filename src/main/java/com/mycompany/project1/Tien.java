/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author ADMIN
 */
public class Tien implements Comparable<Tien> {
    private String mhd,na,ad,bt;
    private int sl,tt,ln;

    public Tien(String mhd, String na, String ad, String bt, int sl, int tt, int ln) {
        this.mhd = mhd;
        this.na = na;
        this.ad = ad;
        this.bt = bt;
        this.sl = sl;
        this.tt = tt;
        this.ln = ln;
    }
    @Override
    public int compareTo(Tien t){
        return -Integer.compare(this.ln, t.ln);
    }
    public void outut(){
        System.out.println(mhd+" "+na+" "+ad+" "+bt+" "+sl+" "+tt+" "+ln);
    }
}
