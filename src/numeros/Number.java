package numeros;

public class Number {

	public Number() {
		// TODO Auto-generated constructor stub
	}
	
	public void numeroperfecto(int n) {
		int sumadiv = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0 && i != n) {
				sumadiv += i;
			}
		if (n == sumadiv)
			System.out.println("\n\nEl número "+n+" es un número perfecto");
		else
			System.out.println("\n\nEl número "+n+" NO ES un número perfecto");

	}
	 //comentaaaaaaaaaaaa

}
