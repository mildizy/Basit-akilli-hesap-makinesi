/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author muhammedYildiz
 */
public class BasitAkıllıHesapMakinesi {  

    public static void main(String[] args) {
        
        Scanner okuyucu=new Scanner(System.in);
        
        System.out.println("~~~~Lütfen bir seçim yapınız~~~~");
        
        System.out.println("1- Üs hesapla ");
        
        System.out.println("2- Karekök hesapla ");
        
        System.out.println("3- Faktöriyel hesapla ");
       
        System.out.println("4- 4 İşlem hesapla ");
        
        System.out.println("5- Yüzde hesapla ");
        
        System.out.println("6- Logaritma hesapla ");
        
        System.out.println("7- Trigonometri hesapla ");
        
        System.out.println("8- Tam bölenleri hesapla ");
        
        double sayi1 ,sayi2;
        
        int islem =okuyucu.nextInt();
        
        if (islem == 1)
        {
            
            System.out.println("Taban kaç? =");
            double taban=okuyucu.nextDouble();
            System.out.println("Kuvvet kaç? =");
            double kuvvet=okuyucu.nextDouble();
            
            System.out.println("Sonuç = "+Math.pow(taban,kuvvet));
            
            
            
            
        }
        else if (islem==2)
        {
            System.out.println("Taban kaç? =");
            double taban=okuyucu.nextDouble();
            System.out.println("Kök derecesi kaç? =");
            double kuvvet=okuyucu.nextDouble();
            
            System.out.println("Sonuç = "+Math.pow(taban,(1/kuvvet)));
        }
        
        else if(islem==3)
        {
            
            int faktoriyel=1;
        System.out.println("Faktoriyel? ");
         int sayi=okuyucu.nextInt();
         for (int i=1;i<=sayi ; i++)
         {
             faktoriyel = faktoriyel*i;
             System.out.println("faktoriyel "+i+ "= "+faktoriyel);
         }
         
            
        }
        else if (islem==4)
        {
            System.out.println("Birinci sayıyı giriniz = ");
            
            sayi1=okuyucu.nextDouble();
            
             System.out.println("İşleminizi giriniz ('*','/','+','-') = ");
           
             String a =okuyucu.next();
            System.out.println("İkinci sayıyı giriniz = ");
            sayi2=okuyucu.nextDouble();
           
            if (null!=a)
            switch (a) {
                case "+" -> System.out.println("Sonuç = "+(sayi1+sayi2));
                case "-" -> System.out.println("Sonuç = "+(sayi1-sayi2));
                case "*" -> System.out.println("Sonuç = "+(sayi1*sayi2));
                case "/" -> System.out.println("Sonuç = "+(sayi1/sayi2));
                default -> System.out.println("Hatalı giriş yaptınız");
            }
        }
        else if(islem==5)
        {
            System.out.println("Yüzdesini almak istediğiniz sayıyı giriniz = ");
            
            int yuzde=okuyucu.nextInt();
            
            System.out.println(yuzde+"'in yüzde kaçı = ");
            int kac = okuyucu.nextInt();
            double sonuc=(yuzde*kac)/100;
            System.out.println(yuzde+"%"+kac+ " = "+sonuc);
            
        }
        else if(islem==6)
        {
            
            System.out.println("e=2.71828182846");
            System.out.println("Tabanı giriniz = ");
            double taban=okuyucu.nextDouble();
            System.out.println("Sayıyı giriniz = ");
            double sayi=okuyucu.nextDouble();
            
            int sonuc= (int) (Math.log(sayi)/Math.log(taban));

            System.out.println(taban+" tabanında "+sayi+" = "+sonuc);
            
            
        }
        else if (islem ==7)   
        {
            System.out.println("1- sin hesapla");
            System.out.println("2- cos hesapla ");
            System.out.println("3- tan hesapla ");
            System.out.println("4- cot hesapla ");
            
            
            int giris=okuyucu.nextInt();
            
            if (giris == 1)
            {
                System.out.println("sin için Değer giriniz = ");
                int deger=okuyucu.nextInt();
                System.out.print("sin"+deger+"="+Math.sin(deger));
                
            }
            else if(giris ==2)
            {
                System.out.println("cos için Değer giriniz = ");
                int deger=okuyucu.nextInt();
                System.out.print("cos"+deger+"="+Math.cos(deger));
                
            }
            else if (giris ==3)
            {
                System.out.println("tan için Değer giriniz = ");
                int deger=okuyucu.nextInt();
                System.out.print("tan"+deger+"="+Math.tan(deger));
                
            }
            else if (giris == 4)
            {
                System.out.println("cot için Değer giriniz = ");
                int deger=okuyucu.nextInt();
                System.out.print("cot"+deger+"="+Math.tan(1/deger));
                
            }
        }
        
        else if(islem==8)
        {
            System.out.print("Bölenlerini bulmak istediğiniz sayıyı giriniz = ");
            int sayi=okuyucu.nextInt();
            System.out.println(sayi+" sayısının tam bölenleri = ");
            for (int i =1;i<=sayi;i++)
            {
                if (sayi%i==0)
                {
                System.out.println(i+" "+sayi+" sayisina tam bölünür");
                
                }
            }   }
        
        else 
        {
            System.out.println("Hatalı giriş yaptınız...");
        }
    }
}
