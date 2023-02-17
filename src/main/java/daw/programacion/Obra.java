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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String visualizarObraToString() {
        return "Tipo: " + tipo + "\nNombre: " + nombre + "\nAutor: " + autor + "\nPrecio: " + precio
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

    public double obternerComisionGaleria(){
        double comisionGaleria;

        comisionGaleria = precio * 0.25;
        System.out.println("Comision galeria: " + comisionGaleria);
        return comisionGaleria;
    }
    public double obtenerImportePeso(){
        double importePeso;

        if (peso <= 0.001)
            importePeso = 20;
        else
            importePeso = 100;
        System.out.println("Importe por peso(€): " + importePeso);
        return importePeso;
    }

    public double obtenerImporteAltura(){
        double importeAltura = 0;
        if (altura <= 2)
            importeAltura = 20;
        else{
                importeAltura = 100;
        }
        System.out.println("Importe por altura(€): " + importeAltura);
        return importeAltura;
    }

    public double obtenerImporteAdicional(){
        double importeAdicional = 0;

        for(int i = 3; i <= piezas; i++){
            importeAdicional += 10;
            System.out.println("Importe adicional - Pieza " + i + " (€): 10");
        }
        return importeAdicional;
    }

    public void obtenerPrecio(){

        double precioVenta = 0;
        double descuentoObra = 0;
        double sobrecoste = 0;
        double precioFinal = 0;

        System.out.println(obternerPrecioToString());
        System.out.println("------------------------------------------");
        precioVenta = obternerComisionGaleria() + obtenerImportePeso() + obtenerImporteAltura() + obtenerImporteAdicional();
        System.out.println("Precio de venta(€): " + precioVenta);

        if (tipo == "Pintura"){
            descuentoObra = precioVenta * 0.1;
            System.out.println("Descuento (10% Pintura): " + descuentoObra);
        }
        else if(tipo == "Escultura"){
            descuentoObra = (precioVenta * 0.2);
            sobrecoste = 50;
            System.out.println("Descuento (20% Escultura): " + descuentoObra);
            System.out.println("Sobrecoste Manipulación: " + sobrecoste);
        }
        precioFinal = precioVenta - descuentoObra + sobrecoste;
        System.out.println("Precio final de venta(€): " + precioFinal);
    }
}
