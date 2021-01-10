package homeWork3.calcs;
import homeWork3.calcs.CalculatorWithOperator;
//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {


    CalculatorWithOperator calc = new CalculatorWithOperator();
        double add = calc.add(15, 7);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double plus = calc.plus(4.1, add);
        double result = calc.plus(plus, pow);

        System.out.println(result);
}
}