package cadenas;

public class Cadena {

	public Cadena() {
		// TODO Auto-generated constructor stub
	}
	
	public  boolean esPalindromo(String cadena) {

		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		String invertida = new StringBuilder(cadena).reverse().toString();
		return invertida.equals(cadena);
	} //comentaaaaaaaaaaaa

}
