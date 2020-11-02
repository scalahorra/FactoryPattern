package peliculas;

public class PeliculaAccion implements Pelicula{
	
	//Utilizamos el método creado en la interfaz Pelicula pero con el matiz del tipo de pelicula de accion
	public void genero() {
		
		System.out.println("Está viendo una película de acción.");
	}
}
