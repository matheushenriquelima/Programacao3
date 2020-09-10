package q6;

import java.util.ArrayList;
import java.util.Collections;


public class MaiorMenor  
{
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public MaiorMenor(int... numeros) 
	{
		for (int i = 0; i < numeros.length; i++) {
			this.numeros.add(numeros[i]);
		}
	}
	public int getMaior() {
		Collections.sort(numeros);
		
		return numeros.get(numeros.size()-1);
	}
	public int getMenor() {
		Collections.sort(numeros);
		
		return numeros.get(0);
	}
	
	
	public static void main(String[] args) {
		MaiorMenor mm = new MaiorMenor(1,4,3,6,7,4,5,3);
		System.out.println("Maior: " + mm.getMaior());
		System.out.println("Menor: "+ mm.getMenor());
	}


}
