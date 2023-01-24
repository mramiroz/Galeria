package daw.programacion;

public class Pintura extends Obra {
    private String tecnica;
    public Pintura(int id, String nombre, String autor, int precio, int altura, int peso, int piezas, String tecnica){
        super(id, nombre, autor, precio, altura, peso, piezas);
        this.tecnica = tecnica;
    }
    public String getTecnica() {
        return tecnica;
    }
    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
}
