package daw.programacion;

public class Escultura extends Obra{
    private String material;
    public Escultura (int id, String tipo, String nombre, String autor, double precio, double altura, double peso, int piezas, String desc, String material){
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String toString() {
        return material;
    }
    
}
