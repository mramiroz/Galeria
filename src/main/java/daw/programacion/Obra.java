package daw.programacion;

public class Obra {
    private int id;
    private String nombre;
    private String autor;
    private int precio;
    private int altura;
    private int peso;
    private int piezas;
    
    public Obra(int id, String nombre, String autor, int precio, int altura, int peso, int piezas)
    {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
    }
}