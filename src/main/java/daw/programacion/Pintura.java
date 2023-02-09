package daw.programacion;

public class Pintura extends Obra {
    private String tecnica;
    public Pintura(int id, String tipo,String nombre, String autor, double precio, double altura, double peso, int piezas,String desc, String tecnica){
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.tecnica = tecnica;
    }
    public String getTecnica() {
        return tecnica;
    }
    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public static double descuentoPintura(double precioVenta){
        double precioFinal;
        precioFinal = precioVenta * 0.01;
        return (precioFinal);
    }

}
