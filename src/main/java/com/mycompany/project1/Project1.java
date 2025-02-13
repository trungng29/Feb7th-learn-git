/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

/**
 *
 * @author ADMIN
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class Project1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<KhachHang> lis = new ArrayList<>();
        List<HangHoa> li = new ArrayList<>();
        List<HoaDon> l = new ArrayList<>();
        List<Tien> il = new ArrayList<>();
        sc.nextLine();
        while(n-->0){
            String na = sc.nextLine();
            String ge = sc.nextLine();
            String da = sc.nextLine();
            String ad = sc.nextLine();
            KhachHang h = new KhachHang(na,ge,da,ad);
            lis.add(h);
        }
        int m = sc.nextInt();
        while(m-->0){
            sc.nextLine();
            String bt = sc.nextLine();
            String re = sc.nextLine();
            int gm = sc.nextInt();
            int gb = sc.nextInt();
            HangHoa h = new HangHoa(bt,re,gm,gb);
            li.add(h);
        }
        int r = sc.nextInt();
        sc.nextLine();
        while(r-->0){
            String rgv = sc.nextLine();
            HoaDon hd = new HoaDon(rgv);
            l.add(hd);
        }
        for(HoaDon i:l){
            String mhd = i.getMhd();
            String na="";
            String ad="";
            String bt="";
            int sl=0,tt=0,ln=0;
            for(KhachHang j:lis){
                if(j.getMkh().equals(i.getMkh())){
                    na = j.getNa();
                    ad = j.getAd();
                    break;
                }
            }
            for(HangHoa j:li){
                if(j.getMhh().equals(i.getMhh())){
                    bt = j.getBt();
                    sl = i.getSl();
                    tt = j.getGb()*i.getSl();
                    ln = (j.getGb()-j.getGm())*i.getSl();
                    break;
                }
            }
            Tien t = new Tien(mhd,na,ad,bt,sl,tt,ln);
            il.add(t);
        }
        Collections.sort(il);
        for(Tien t:il){
            t.outut();
        }
    }
}
