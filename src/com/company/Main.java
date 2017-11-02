package com.company;

public class Main {

    public static void main(String[] args) {
        NotasModel model = new NotasModel();
         NotasGUI view = new NotasGUI();
         NotasController controller = new NotasController(model, view);
    }
}
