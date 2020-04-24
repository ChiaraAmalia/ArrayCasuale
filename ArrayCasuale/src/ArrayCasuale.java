import java.util.Random;
import java.lang.Math;
//scrivo a caso
public class ArrayCasuale {

	public static void main(String[] args) {
		
		int numeri[] = generaArray(10);
		
		System.out.println("Elenco dei numeri: ");
		for(int i=0; i<numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		
		System.out.println("somma dei numeri casuali: " +sommaTutti(numeri));

	}
	
	private static int[] generaArray(int n) {
	
		int[] ris = new int[n];
//		Random rng = new Random();
		
		for(int i=0; i<n; i++) {
			//ris[i] = rng.nextInt();
			ris[i] = (int)(Math.random() * 100);
		}
		
		return ris;
	}
	
	private static int sommaTutti(int[] a) {
		
		int somma = 0;
		for(int x:a) somma +=x;
		return somma;
	}

}
