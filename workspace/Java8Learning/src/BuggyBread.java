 class BuggyBread12 { 
   public void move(){ 
      System.out.println("Vehicle is moving"); 
   } 
} 

public class BuggyBread extends BuggyBread1{ 
   public void move(){ 
//      super.move(); 
      System.out.println("Car is moving"); 
   } 

   public static void main(String[] args){ 
      new Car().move(); 
   } 
}