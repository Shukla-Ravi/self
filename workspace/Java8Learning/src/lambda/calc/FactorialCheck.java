package lambda.calc;

import java.util.function.IntFunction;

public class FactorialCheck {
  public static void main(String[] args) {
    IntFunction<Long> factorialCalc = FactorialCheck::factorial;
    System.out.println(factorialCalc.apply(10));
    
    System.out.println(factorial(0));
  }
  public static long factorial(int n) {
    if (n > 0) {
    	return n * factorial(n - 1);
    }else {
    	return 1;
    }
  }
}