package com.example;

/**
 * Created by joselm on 17/08/16.
 */
public class Principal {
    public static void main(String[] main){
        Lugar lugar = new Lugar("ETSII", "C/...", -0.166093, 38.995656, 962849300, "http://...",
                "Escuela tecnica...", 10, TipoLugar.EDUCACION);
        System.out.println(lugar.toString());
    }
}
