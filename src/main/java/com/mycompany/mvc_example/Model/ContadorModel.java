/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc_example.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-Gamer
 */
public class ContadorModel {
    
    private int valor = 0;
    private final List<Observer> observers = new ArrayList<>();
    
    public int getValor() {
        return valor;
    }
    
    public void incrementar() {
        this.valor++;
        System.out.println("Model: Valor incrementado para " + this.valor);
        notificarObservers();
    }

    public void decrementar() {
        this.valor--;
        System.out.println("Model: Valor decrementado para " + this.valor);
        notificarObservers();
    }
    
    public void adicionarObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        this.observers.remove(observer);
    }

    private void notificarObservers() {
        System.out.println("Model: Notificando " + observers.size() + " observer(s)...");
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
