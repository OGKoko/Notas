package com.company;

import javax.swing.*;
import java.awt.*;

public class NotasGUI extends JFrame{

    public JLabel display;
    public JTextField entrada;
    public JButton ok, cancel;

    public NotasGUI(){
        this.setTitle("Notas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes(this.getContentPane());
        this.pack();
        this.setVisible(true);
    }

    void componentes (Container pane){
        pane.setLayout(new GridLayout(3,1));
        display = new JLabel("");
        pane.add(display);
        ok = new JButton("ok");
        cancel = new JButton("cancel");
        entrada = new JTextField(12);
        pane.add(display);
        pane.add(entrada);
        pane.add(ok);
        pane.add(cancel);




    }
}



