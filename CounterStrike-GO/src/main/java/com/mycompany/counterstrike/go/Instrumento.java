/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.counterstrike.go;

/**
 *
 * @author diego
 */
public abstract class Instrumento implements Interactuar{
    protected String nombre;
    protected int municionTotal;
    
    @Override
    public abstract void disparar();

    @Override
    public void recargar() {
    }

    @Override
    public void dropear() {
        System.out.println("El instrumento ha sido tirado");
    }
}