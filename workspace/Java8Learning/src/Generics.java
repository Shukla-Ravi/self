import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class A<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class Generics {
    static<E> void print(E[] elements){
        for(E element:elements){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        A<String> obj=new A<String>();
        A<Integer> obj1=new A<Integer>();
        obj.add("hello");
        obj1.add(6);
        System.out.println(obj.get());
        System.out.println(obj1.get());

        Long[] arr={1l,3l,(long) 5,(long) 7};
        print(arr);
        
        
        



Set<Integer> intSet = new HashSet<Integer>();

// Add Elements
intSet.add(1);
intSet.add(2);
intSet.add(3);
intSet.add(4);

// Set the predicate or the condition for filtering the elements.

Predicate<Integer> moreThan2Pred = (p) -> (p > 1); 
Predicate<String> checkString = (z) -> (z == "L");

// Use Filter to refine the element set, sort to Sort and Collectors.toSet to get a set out of Stream.

intSet =  intSet.stream().filter(moreThan2Pred).sorted().collect(Collectors.toSet());

System.out.println(intSet); // Prints [2, 3, 4]
String x= "L";
//x.equalsIgnoreCase(checkString);
    }
}