/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ayudantias4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AyudantiaS4 {

    public static void main(String[] args) {
        
        Mail m1 = new Mail("123123", "juan@gmail.com","pedro@gmail.com","Ayudantia", "Hola Pedro");
        System.out.println(m1);
        
        Mail m2 = new Mail("456456", "maria@gmail.com","Pepe@gmail.com","Ayudantia2", "Chao");
        System.out.println(m2);
        
        Scanner sc = new Scanner(System.in);
        //Mail m3 = Mail.nextMail(sc);
        //System.out.println(m3);
        //Hola
        
       
        
        ArrayList<Mail> listaMail = new ArrayList<>();
        listaMail.add(m1);
        listaMail.add(m2);
        System.out.println(listaMail.toString());
        
        Buzon b1 = new Buzon();
        b1.setLista(listaMail);
        
        Buzon b2 = new Buzon(listaMail);
        System.out.println(b1);
        

        
        
        
    }
}
