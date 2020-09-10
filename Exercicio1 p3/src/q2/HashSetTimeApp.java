package q2;


import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTimeApp 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		String a = "Valor"; String b = "Value"; String c = "Texto"; String d = "Text";
	
		Instant start = Instant.now();

		hs.add(a); hs.add(b); hs.add(c); hs.add(d);

		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		hs.remove(a); hs.remove(b);hs.remove(c);hs.remove(d);
		
		 Instant end = Instant.now();
		 Duration timeElapsed = Duration.between(start, end); 
		
		System.out.println("HashSet time: " + timeElapsed );
		
				
	}
}
