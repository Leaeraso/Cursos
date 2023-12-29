package mxcom.gm.peliculas.servicio;

public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "pelicula.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPeliculas(String buscar);
    
    void iniciarCatalogoPeliculas();
}
