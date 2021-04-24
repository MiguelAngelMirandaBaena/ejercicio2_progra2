public class Plaza {
    private int idPlaza;
    private Vuelo vuelo;
    private Categoria categoria;
    private int numeroPlaza;
    private double tarija;

    public Plaza(int idPlaza, Vuelo vuelo, Categoria categoria, int numeroPlaza, double tarija) {
        this.idPlaza = idPlaza;
        this.vuelo = vuelo;
        this.categoria = categoria;
        this.numeroPlaza = numeroPlaza;
        this.tarija = tarija;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public double getTarija() {
        return tarija;
    }

    public void setTarija(double tarija) {
        this.tarija = tarija;
    }
}
