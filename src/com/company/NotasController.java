package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotasController implements ActionListener {
    private NotasModel model;
    private NotasGUI view;

    public NotasController(NotasModel model, NotasGUI view) {
        this.model = model;
        this.view = view;

        this.view.display.setText(model.getResultado());
        view.ok.addActionListener(this);
        view.cancel.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(view.cancel == e.getSource()){
            view.entrada.setText("");
            model.reset();
            view.display.setText(model.getResultado());
        }else if (view.ok==e.getSource()){
            view.display.setText(model.evaluarNota(Float.parseFloat(view.entrada.getText())));
            view.entrada.setText("");
        }

    }
}
