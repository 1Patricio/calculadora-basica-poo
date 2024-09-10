import java.util.ArrayList;

abstract class Calculadora {

    private double resultado;

    abstract void calcular(Operador operador, ArrayList<Double> lista); //Primeiro é o tipo e o segundo a variável

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
