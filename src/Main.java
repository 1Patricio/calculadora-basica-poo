import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instânciando nossa lista
        ArrayList<Double> listaSoma = new ArrayList();
        listaSoma.add(20.0);
        listaSoma.add(32.0);

        ArrayList<Double> listaSubtracao = new ArrayList();
        listaSubtracao.add(15.0);
        listaSubtracao.add(12.0);

        ArrayList<Double> listaDivisao = new ArrayList();
        listaDivisao.add(15.0);
        listaDivisao.add(3.0);

        ArrayList<Double> listaMultiplicacao = new ArrayList();
        listaMultiplicacao.add(2.0);
        listaMultiplicacao.add(3.0);

        Soma soma = new Soma(); //Novo objeto
        Substracao substracao = new Substracao(); //Novo objeto
        Divisao divisao = new Divisao();//Novo objeto
        Multiplicacao multiplicacao = new Multiplicacao(); // Novo objeto

        Calculadora calculadora = new CalculadoraBasica(); //Polimosfismo //Criei uma instância da calculadora

        calculadora.calcular(soma, listaSoma); //Orientando a soma
        System.out.println(calculadora.getResultado());

        calculadora.calcular(substracao, listaSubtracao); //Orientando a subtração
        System.out.println(calculadora.getResultado());

        calculadora.calcular(divisao, listaDivisao); //Orientando a divisão
        System.out.println(calculadora.getResultado());

        calculadora.calcular(multiplicacao, listaMultiplicacao); //Orientando a divisão
        System.out.println(calculadora.getResultado());

    }
}

//video pausado em 30:00