public class Categoria {
    private int idCategorias;
    private String nombre;

    //metodo constructor


    public Categoria(int idCategorias, String nombre) {
        this.idCategorias = idCategorias;
        this.nombre = nombre;
    }
    public int getIdCategoria(){
        return idCategorias;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategorias = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
