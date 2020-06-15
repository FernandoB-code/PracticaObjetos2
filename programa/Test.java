package thp.ej7.programa;

import thp.ej7.clases.Gato;
import thp.ej7.clases.Raton;


public class Test {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato(100); // energia del gato
		Raton raton1 = new Raton(100); // energia del raton
		
		
		System.out.println("¿El gato alcanza al raton?: ");
		System.out.println(gato1.alcanzar(raton1, 50));// 2do parametro = metros a los que se encuentra el ratón del gato.
		
	
		
				
	}

}
