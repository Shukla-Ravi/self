package lambda.calc;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {9,10, 1, 12};
		Integer z[] = {5,3,7};
Calculator cl= (dd)-> a[1]+a[2]+a[3];
engine(cl);
//System.out.println(cl.result(a));
	
//System.out.println(check(a).result(null));


StringFunctionInterface<Integer, String> str= (zz) -> String.valueOf(a[3]/z[1]);


StringFunctionInterface<Integer, String> str1= (zz) -> String.valueOf(TestCalc.check(a));

System.out.println(str.result(null));
System.out.println(str1.result(null));

	}
	  private static void engine(Calculator calculator){
		    int x[] = null ;
		    int result = calculator.result(x);
//		    System.out.println(result);
		  }
	
	  
	  public static Calculator check(Integer[] a)
	  {
//		  int n[] = {2,5, 9};
		  Calculator n = (nn)-> a[0]*a[1]*a[2];
		  System.err.println(n);
		  return n;
	  }
}
