package homeWork3.calcs;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

        @Override
        public double pow(double a, int b){
            return Math.pow(a, b);
        }

        @Override
        public double abs(double a){
            return Math.abs(a);
        }

        @Override
        public double sqrt(double a){
            return Math.sqrt(a);
        }
    }


