package daw.programacion;

public class Precio {
    private static double precioVenta = 0;
    private static double comisionGaleria = 0;
    private static double importePeso = 0;
    private static double importeAltura = 0;
    private static double importeAdicional = 0;
    private static double descuento = 0;
    private static double precioFinal = 0;

    public static void obtenerPrecioObra(Obra obra){
        double precio = obra.getPrecio();
        int pieza = obra.getPiezas();
        double peso = obra.getPeso();
        double altura = obra.getAltura();

        System.out.println(obra.obternerPrecioToString());

        comisionGaleria = precio * 0.25;
        System.out.println("Comision galeria: " + comisionGaleria);

        if (peso <= 0.001)
            importePeso = 20;
        else
            importePeso = 100;
        System.out.println("Importe por peso(€): " + importePeso);

        if (altura <= 2)
            importeAltura = 20;
        else{
            for(int i = 0; i < pieza; i++)
                importeAltura += 100;
        }
        System.out.println("Importe por altura(€): " + importeAltura);

        for(int i = 3; i <= pieza; i++){
            importeAdicional += 10;
            System.out.println("Importe adicional - Pieza " + i + " (€): 10");
        }

        precioVenta = comisionGaleria + importeAdicional + importeAltura + importePeso + importeAltura;
        System.out.println("Precio de venta(€): " + precioVenta);

        if(obra.getTipo() == "Pintura")
            descuento = precioVenta * 0.1;
        System.out.println("Descuento (10% óleo €): " + descuento);
        
        precioFinal = precioVenta - descuento;
        System.out.println("Precio final de venta(€): " + precioFinal);

    }

}
