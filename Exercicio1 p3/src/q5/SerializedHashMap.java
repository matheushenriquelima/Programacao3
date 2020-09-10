package q5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class SerializedHashMap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Samsung", 200);hmap.put("Lg", 100); hmap.put("Sony", 150); hmap.put("Xiaomi", 300);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Hashmap.ser")))
		{
			oos.writeObject(hmap);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
