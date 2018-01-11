import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class Strem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> intSet = new HashSet<Integer>();

		Set<Integer> intSet2 = new HashSet<Integer>(); 

		// Add Elements

		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet2.add(1);
		intSet2.add(2);
		intSet2.add(3);
		intSet2.add(4); 

		// Use the stream and collectors to Summarize all Integer elements 
		IntSummaryStatistics summary = intSet.stream().collect(Collectors.summarizingInt(lp->((Integer)lp)));
		summary.combine(intSet2.stream().collect(Collectors.summarizingInt(p->((Integer)p))));
		System.out.println(summary);
		
	}

}
