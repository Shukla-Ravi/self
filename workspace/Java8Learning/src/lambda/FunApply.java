package lambda;
import java.util.function.Function;
/*from w ww. j  a v a 2s.c  o m*/
public class FunApply {

	
	static {
	}
  public static void main(String[] args)  {

    String result = calc((a) -> "Result: " + (a * 2), 10);

    System.out.println(result);

  }
  public static String calc(Function<Integer, String> bi, Integer i) {
    return bi.apply(i);
  }  
}