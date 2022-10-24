/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayudantias4;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Mail {
    private String identificador;
    private String origen;
    private String destino;
    private String titulo;
    private String mensaje;
    
    private static int valor;

    public Mail(String identificador, String origen, String destino, String titulo, String mensaje) {
        this.identificador = identificador;
        this.origen = origen;
        this.destino = destino;
        this.titulo = titulo;
        this.mensaje = mensaje;
    }
    
    public Mail(){
        this.identificador = "0";
        this.origen = "juan@gmial.com";
        this.destino = "paoc@hotmial.com";
        this.titulo = "ejemplo titulo";
        this.mensaje = "ejemplo mensaje";
    }


    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //<from:ruben@org.com, to:maria@org.com, tittle: correo de prueba, message: esto es un mensaje de prueba>
    @Override
    public String toString() {
        return "<from:"+origen+", to:"+destino+", tittle:"+titulo+", message: "+mensaje+">";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //self check
            return true;
        }
        if (obj == null) { //null check
            return false;
        }
        if (getClass() != obj.getClass()) { //class check
            return false;
        }
        final Mail other = (Mail) obj;
        return Objects.equals(this.identificador, other.identificador);
    }
    
    
    public static Mail nextMail(Scanner sc){
        Mail m1 = null;
        //int(input("ingrese tal cosa:"))
        System.out.println("Ingrese el identificador");
        String id = sc.nextLine();
        System.out.println("Ingrese el correo de origen");
        String origen = sc.nextLine();
        System.out.println("Ingrese el correo de destino");
        String destino = sc.nextLine();
        System.out.println("Ingrese el titulo del correo");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el mensaje");
        String mensaje = sc.nextLine();
        
        m1 = new Mail(id,origen,destino,titulo,mensaje);
        return m1;
        
    }
    
    
    
}
