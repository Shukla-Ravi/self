package lambda.calc;
import java.util.function.BiFunction;
import java.util.function.Function;
/*from w  w w . j a v a 2s .co m*/
public class MainValueOf{
  public static void main(String[] argv){
    // Uses  Integer.valueOf(int)
    Function<Integer, Integer> func1  = Integer::valueOf;

    // Uses  Integer.valueOf(String)
    Function<String, Integer> func2  = Integer::valueOf;

    // Uses  Integer.valueOf(String, int)
    BiFunction<String, Integer,  Integer> func3  = Integer::valueOf;

    System.out.println(func1.apply(7)); 
    System.out.println(func2.apply("7")); 
    System.out.println(func3.apply("101010101010", 7));
  }
}