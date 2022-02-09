import java.util.Arrays;
import java.util.List;

import cadenas.Cadena;
import listas.Lista;
import numeros.Number;

public class TestAdrianVidal {

	public static void main(String[] args) {
		List<Integer> slist = Arrays.asList(4, 5, 1, 2, 8, 9, 6);
		Lista lista = new Lista();
		lista.ordenalistaASC(slist);

		List<Integer> ASC = Arrays.asList(50, 54, 57, 80, 110);
		List<Integer> DESC = Arrays.asList(50, 40, 31, 8, 1);
		List<Integer> NOORD = Arrays.asList(4, 5, 1, 2, 8, 9, 6);

		System.out.println("La lista ascendente, tiene como resultado: " + lista.orden(ASC));
		System.out.println("La lista descendente, tiene como resultado: " + lista.orden(DESC));
		System.out.println("La lista desordenada, tiene como resultado: " + lista.orden(NOORD));

		new Number().numeroperfecto(28);;
		String cadena = "La ruta natural";
		System.out.println("\n\n¿'" + cadena + "' es palíndromo? " + new Cadena().esPalindromo(cadena));
 //comentaaaaaaaaaaaa
	}

}
