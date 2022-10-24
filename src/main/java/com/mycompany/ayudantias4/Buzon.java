/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayudantias4;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Buzon {
    private ArrayList<Mail> lista;

    public Buzon() {
        lista = new ArrayList<>();
    }

    public Buzon(ArrayList<Mail> lista) {
        this.lista = lista;
    }
    

    public ArrayList<Mail> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Mail> lista) {
        this.lista = lista;
    }

//    [ Mail 1: <from:ruben@org.com, to:maria@org.com, tittle: correo de prueba,
//    message: esto es un mensaje de prueba>, Mail 2: <from:carla@org.com, to:julio@org.com,
//            tittle: correo de prueba, message: esto es un mensaje de prueba>, 
//            Mail 3: <from:luis@org.com, to:maria@org.com, tittle: correo de prueba, message: 
//            esto es un mensaje de prueba>]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Buzon:{");
        int contador = 1;
        for (int i= 0; i<lista.size(); i++){
            sb.append("Mail "+String.valueOf(contador));
            sb.append(lista.get(i).toString());
            sb.append(",");
            contador++;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("}");
        return sb.toString();
    }
    
    
    
     
    
    
}
