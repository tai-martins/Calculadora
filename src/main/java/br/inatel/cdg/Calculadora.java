package br.inatel.cdg;

public class Calculadora {

        public int adicao ( int a, int b){
            return a + b;
        }

        public int subtracao ( int i, int j){
            return i - j;
        }

        public int multiplicacao ( int m, int n){
            return m * n;
        }

        public double divisao ( double x, double y){
            if (y == 0)
                throw new IllegalArgumentException("Divisão por zero");
            return x / y;
        }
}


