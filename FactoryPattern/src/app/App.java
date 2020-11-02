package app;

import factoria.FactoriaPeliculas;
import peliculas.Pelicula;

public class App {

	public static void main(String[] args) {
		
		FactoriaPeliculas factoriaPeliculas = new FactoriaPeliculas();
		
		try {
		
			//Fabricamos un tipo de película e invocamos el método genero
			Pelicula pelicula1 = factoriaPeliculas.getPelicula("ACCION");
			pelicula1.genero();
			
			//Lo mismo con otro tipo de película
			Pelicula pelicula2 = factoriaPeliculas.getPelicula("FANTASIA");
			pelicula2.genero();
			
			//Y lo mismo con el último tipo de película
			Pelicula pelicula3 = factoriaPeliculas.getPelicula("MIEDO");
			pelicula3.genero();
			
			//También metemos un género que no hemos creado para probar
			Pelicula pelicula4 = factoriaPeliculas.getPelicula("NINGUNA");
			pelicula4.genero();
		
		//Ahora capturamos las excepciones que nos den valores nulos para que le aparezca en pantalla el mensaje de que no existen
		} catch(NullPointerException ne) {
			
			System.out.println("No tenemos ninguna película con ese género");
		}
	}
}
