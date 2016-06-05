package joerajeev.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

public class Play {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		/*list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("lisp");
		list.add("c#");*/
		list.add("333");
		list.add("33355");
		list.add("3335");

		int sumUsingSum =  list.stream()
						.map( s -> s.length())
						.mapToInt(i -> new Integer(i))
						.sum();
		
		int sumUsingReduce =  list.stream()
								.map( s -> s.length())
								.mapToInt(Integer::new)
								.reduce(0, (a, b) -> a+b);
		
		int sumUsingReduce2 =  list.stream()
				.map( s -> s.length())
				.mapToInt(Integer::new)
				.reduce(0, Integer::sum);
		
		int sumUsingReduce3 =  list.stream()
								.reduce(0, (a,b) -> a+b.length(), (x, y) -> x + y);
		
	/*	System.out.println("sum using sum(): " +sumUsingSum);
		System.out.println("sum using reduce(): " +sumUsingReduce);
		System.out.println("sum using reduce() again: " +sumUsingReduce2);*/
		
		Averager averageCollect = list.stream()
				.map( s -> s.length())
				.mapToInt(Integer::new)
			    .collect(Averager::new, Averager::accept, Averager::combine);
			                   
			System.out.println("Average: " +
			    averageCollect.average());
			
			List<Integer> collectedValues = averageCollect.getValues();
			System.out.println("collected values");
			for (Integer integer : collectedValues) {
				System.out.println(integer);
			}
			
			
	}
	
	static class Averager 
	{
	    private int total = 0;
	    private int count = 0;
	    public Averager() {
			super();
		}
		List<Integer> values = new ArrayList<Integer>();
	        
	    public double average() {
	        return count > 0 ? ((double) total)/count : 0;
	    }
	    
	    public List<Integer> getValues(){
	    	return values;
	    }
	        
		public void accept(int i) {
			total += i;
			count++;
			values.add(i);
		}
	    public void combine(Averager other) {
	        total += other.total;
	        count += other.count;
	        values.addAll(other.values);
	    }
	}

}
