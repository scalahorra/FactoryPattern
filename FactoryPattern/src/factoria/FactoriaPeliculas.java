package factoria;

import peliculas.Pelicula;
import peliculas.PeliculaAccion;
import peliculas.PeliculaFantasia;
import peliculas.PeliculaMiedo;

public class FactoriaPeliculas {

	//Creamos el método getPelicula para identificar el tipo de pelicula de la cual queremos ver la información
	public Pelicula getPelicula(String generoPelicula) {
		
		//Si la película es de tipo acción, entonces nos dará la información de la película de acción.
		if(generoPelicula.equalsIgnoreCase("ACCION")) {
			
			return new PeliculaAccion();
		}		
		//Si la película es de tipo fantasía, entonces nos dará la información de la película de fantasía.
		else if(generoPelicula.equalsIgnoreCase("FANTASIA")) {
			
			return new PeliculaFantasia();
		}		
		//Si la película es de tipo miedo, entonces nos dará la información de la película de miedo.
		else if(generoPelicula.equalsIgnoreCase("MIEDO")) {
			
			return new PeliculaMiedo();
		}
		
		//Si no es ninguna, nos dará un valor nulo
		else return null;
	}
}
