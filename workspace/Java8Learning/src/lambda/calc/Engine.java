package lambda.calc;
public class Engine {
  public static void main(String[] argv) {
    engine((x,y)-> x + y);// w w  w .j  av a 2s.  c om
    engine((x,y)-> x * y);
    engine((x,y)-> x / y);
    engine((x,y)-> x % y);
  }
  private static void engine(Calculator1 calculator){
    int x = 2, y = 4;
    int result = calculator.calculate(x,y);
    System.out.println(result);
  }
}

@FunctionalInterface
interface Calculator1{
  int calculate(int x, int y);
}