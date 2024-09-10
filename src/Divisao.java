import java.util.ArrayList;

public class Divisao implements Operador{
    @Override
    public double calcular(ArrayList<Double> lista) {
        double result = 1.0;
        for (int i = 0; i < lista.size(); i++ ) {
            result /= lista.get(i);
        }
        return result;
    }
}
