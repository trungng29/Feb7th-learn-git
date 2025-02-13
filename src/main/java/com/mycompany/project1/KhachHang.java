/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String mkh,na,ge,da,ad;
    private static int id=1;

    public KhachHang(String na, String ge, String da, String ad) {
        mkh = String.format("KH%03d", id++);
        this.na = na;
        this.ge = ge;
        this.da = da;
        this.ad = ad;
    }

    public String getMkh() {
        return mkh;
    }

    public String getNa() {
        return na;
    }

    public String getGe() {
        return ge;
    }

    public String getDa() {
        return da;
    }

    public String getAd() {
        return ad;
    }
    
}
