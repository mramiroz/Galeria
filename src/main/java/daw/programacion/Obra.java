package daw.programacion;

public class Obra {
    private int id;
    private String tipo;
    private String nombre;
    private String autor;
    private double precio;
    private double altura;
    private double peso;
    private int piezas;
    private String desc;
    
    public Obra(int id, String tipo, String nombre, String autor, double precio, double altura, double peso, int piezas, String desc)
    {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getPiezas() {
        return piezas;
    }
    public String getDesc() {
        return desc;
    }

    public String visualizarObraToString() {
        return "Nombre: " + nombre + "\nAutor: " + autor + "\nPrecio: " + precio
                + "\nAltura: " + altura + "\nPeso: " + peso + "\nPiezas: " + piezas + "\nDescripción: " + desc;
    }

    public String visualizarObrasToString() {
        return id + " " + nombre + "  " +  autor + "  " + tipo + "  " +  precio
                + "  " + altura + "  " + peso + "  " + piezas + "  " + desc;
    }

    public String imprimirEtiquetaToString() {
        return "Nombre: " + nombre + "\nAutor: " + autor + "\nDescripción: " + desc;
    }

    public String mostrarObrasToString(){
        return id + "   " + nombre; 
    }

    public String obternerPrecioToString() {
        return "Nombre: " + nombre + "\nAltura(m): " + altura + "\nPeso(t): " + peso + "\nNumero de piezas: "  + piezas +
         "\nPrecio(€): " + precio;
    }

    
}
