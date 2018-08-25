public class Ejercicio1 {
	public static void main(String[] args) {	
		Ejercicio1 e1 = new Ejercicio1();
		e1.texto("Holamundo");
	}
	public void texto (String cadena) {
		char arreglo [] = new char [cadena.length()];
		for(int i=0; i<arreglo.length; i++) {
			if(i%2!=0) {
				System.out.print(cadena.charAt(i)+" ");
			}
		}
	}
}
