package polymorphismexample;

public class SampleClass {

        public void sum (int a, int b){

            System.out.println("sum of two integer :" + (a + b));
        }
        public void sum (int a, int b, int c){

            System.out.println("sum of three integer :" + (a+b+c));
        }
        public void sum (double a, double b){

            System.out.println("sum of two double values :" + (a+b));
        }
        public void sum (float a, float b){

            System.out.println("sum of float values :" + (a+b));
        }
}
