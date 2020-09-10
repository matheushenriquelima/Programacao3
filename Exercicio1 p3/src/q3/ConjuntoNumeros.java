package q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Comparador implements Comparator<Integer>
{
	@Override
	public int compare(Integer arg0, Integer arg1) {
		
		return arg1.compareTo(arg0);
	}
	
}


public class ConjuntoNumeros 
{
	private List<Integer> conjunto = new ArrayList<Integer>();
	
	public ConjuntoNumeros(int... numeros) 
	{
		for (int i = 0; i < numeros.length; i++) {
			this.conjunto.add(numeros[i]);
		}
	}
	
	public List<Integer> ordenar()
	{
		Collections.sort(conjunto, new Comparador());
		return conjunto;
	}

}
