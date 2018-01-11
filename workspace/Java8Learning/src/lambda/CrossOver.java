package lambda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CrossOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int res[];
		int _elements_size=0;
		_elements_size= Integer.parseInt(in.nextLine().trim());
		int _elements [] = new int[_elements_size];
		int _elements_item;
		for (int i= 0; i<_elements_size; i++)
		{
			_elements_item = Integer.parseInt(in.nextLine().trim());
			_elements[i]= _elements_item;
		}
		res = rearrange(_elements);
		for(int r=0; r<res.length; r++)
		{
		 System.out.println(String.valueOf(res[r]));	
		}
	}

	
	static int [] rearrange(int _elements[])
	{
		
		Map<Integer, Integer> result  = new TreeMap<>();
		int [] val = new int[_elements.length];
		for (int i: _elements)
		{
			result.put(Integer.valueOf(Integer.toBinaryString(i)), i);
		}
		int z = 0;
		
		
		for(Entry<Integer, Integer> s : result.entrySet())
		{
			System.out.println(s.getKey());
			val[z]= s.getValue();
			z++;			
		}
		
		return val;
		
	}
}
