package q2;

import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTimeApp{
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		String a = "Valor"; String b = "Value"; String c = "Texto"; String d = "Text";
		
		Instant start = Instant.now();

		ts.add(a); ts.add(b); ts.add(c); ts.add(d);

		Iterator<String> iterator2 = ts.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next() + " ");
		}

		ts.remove(a); ts.remove(b);ts.remove(c);ts.remove(d);
		
		Instant end = Instant.now();
	    Duration timeElapsed = Duration.between(start, end); 
		System.out.println("TreeSet time: " + timeElapsed);
		
	}
}
