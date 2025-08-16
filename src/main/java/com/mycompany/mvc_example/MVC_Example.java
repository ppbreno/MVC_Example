package com.mycompany.mvc_example;

import com.mycompany.mvc_example.Controller.ContadorController;
import com.mycompany.mvc_example.Model.ContadorModel;
import com.mycompany.mvc_example.View.ContadorView;

public class MVC_Example {

    public static void main(String[] args) {
        
        ContadorModel model = new ContadorModel();
        ContadorView view = new ContadorView(model); // <- Passando o model, como exigido!
        model.adicionarObserver(view);
        ContadorController controller = new ContadorController(model);
        view.setController(controller);
        view.setVisible(true);
    }
}
