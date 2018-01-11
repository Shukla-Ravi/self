package lambda;
public class Calc {
/*w  w  w. ja  va  2  s .  com*/
  public static void main(String[] args) {
    MyIntegerCalculator myIntegerCalculator = ( s2) -> s2 * 2;

    System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(15));

  }
}
interface MyIntegerCalculator {

  public Integer calcIt(Integer s1);

}