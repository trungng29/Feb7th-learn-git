/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private String mkh,mhh,mhd;
    private int sl;
    private static int id=1;
    
    public HoaDon(String rgv) {
        mhd = String.format("HD%03d", id++);
        String a[] = rgv.split("\\s+");
        mkh = a[0];
        mhh = a[1];
        sl = Integer.parseInt(a[2]);
    }

    public String getMkh() {
        return mkh;
    }

    public String getMhh() {
        return mhh;
    }

    public String getMhd() {
        return mhd;
    }

    public int getSl() {
        return sl;
    }
}
