package com.company;


public class NotasModel {

    private float nota;
    private String resultado;

    private static final String pred = "Resultado: ";
    private static final String cateado = "Resultado: cateado";
    private static final String bien = "Resultado: bien";
    private static final String genial = "Resultado: Genial :)";

    public NotasModel() {
        reset();
    }


public void reset (){
    this.nota = 0;
    this.resultado = pred;
}

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }



    public String evaluarNota(float nota) {
        setNota(nota);
            if (this.nota < 5) {
                setResultado(NotasModel.cateado);
            } else if (this.nota < 7) {
                setResultado(NotasModel.bien);
            } else if (this.nota > 7) {
                setResultado(NotasModel.genial);
                }
                return this.resultado;
            }
    }
