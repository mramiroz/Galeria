package daw.programacion;

public class Escultura extends Obra{
    private String material;
    public Escultura (int id, String tipo, String nombre, String autor, int precio, int altura, int peso, int piezas, String material){
        super(id, tipo, nombre, autor, precio, altura, peso, piezas);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}
