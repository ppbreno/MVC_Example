/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc_example.Controller;

import com.mycompany.mvc_example.Model.ContadorModel;

/**
 *
 * @author T-Gamer
 */
public class ContadorController {
    private final ContadorModel model;
    
    public ContadorController(ContadorModel model) {
        this.model = model;
    }

    public void incrementarValor() {
        model.incrementar();
    }

    public void decrementarValor() {
        model.decrementar();
    }
}
