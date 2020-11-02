package peliculas;

public class PeliculaMiedo implements Pelicula{
	
	//Utilizamos el método creado en la interfaz Pelicula pero con el matiz del tipo de pelicula de miedo.
	public void genero() {
		
		System.out.println("Está viendo una película de miedo.");
	}

}
