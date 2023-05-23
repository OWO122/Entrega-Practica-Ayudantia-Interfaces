/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.counterstrike.go;

/**
 *
 * @author diego
 */
public class Arma extends Instrumento{
   
    
    private int balasEnCargador;
    private int tamCargador;

    public Arma(int balasEnCargador, int tamCargador) {
        this.balasEnCargador = balasEnCargador;
        this.tamCargador = tamCargador;
    }
    
    @Override
    public void disparar(){
        System.out.println("El arma ha sido disparada");
        balasEnCargador = balasEnCargador-1;
    }
    
    @Override
    public void recargar(){
        System.out.println("Recargando");
        municionTotal = municionTotal-(tamCargador-balasEnCargador);
        if (municionTotal>=tamCargador)
            balasEnCargador = tamCargador;
        else 
            System.out.println("No hay suficientes balas en el cargador");
    }
    

    public int getBalasEnCargador() {
        return balasEnCargador;
    }

    public void setBalasEnCargador(int balasEnCargador) {
        this.balasEnCargador = balasEnCargador;
    }

    public int getTamCargador() {
        return tamCargador;
    }

    public void setTamCargador(int tamCargador) {
        this.tamCargador = tamCargador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMunicionTotal() {
        return municionTotal;
    }

    public void setMunicionTotal(int municionTotal) {
        this.municionTotal = municionTotal;
    }
    
    
}
