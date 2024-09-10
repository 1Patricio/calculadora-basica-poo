import java.util.ArrayList;

public class CalculadoraBasica extends Calculadora{ //Herdando tudo que a classe calculadora tem

    @Override //Sobescrita de metodos
    void calcular(Operador operador, ArrayList<Double> lista) {
        setResultado(operador.calcular(lista)); //Resultado
    }

}
