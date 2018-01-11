import java.util.Arrays;
import java.util.List;

public class Car extends Vehicle{ 
   public void move(){ 
      System.out.println("Car is moving"); 
   } 

   public static void move1(){ 
	      System.out.println("Car1 is moving"); 
	   } 
   
   public static void main(String[] args){ 
      Car vehicle = new Car(); 
      ((Vehicle)vehicle).move(); 
      
      String str1 = "String1";
      String str2 = "String2";
      str1.concat("String3");
      System.out.print(str1);
      System.out.println(str2);
      
      
      List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
   	//java, python, nodejs, ruby
  String result = String.join(", ", list);
  System.out.println(result);
   } 
}