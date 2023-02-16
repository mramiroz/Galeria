package daw.programacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Galeria {
    static Obra obra1 = new Escultura(001, "Escultura", "David", "Miguel Angel", 30, 2, 20, 5,"Obra Renacimiento", "marmol");
    static Obra obra2 = new Escultura(002, "Escultura", "Medusa", "Donatello", 30, 2, 20, 1,"Obra renacimiento", "metal");
    static Obra obra3 = new Pintura(003, "Pintura", "Guernica", "Picasso", 30, 2, 20, 1, "Guerra Civil española", "oleo");
    static Obra obra4 = new Pintura(004, "Pintura", "Tres delicias", "Bosco", 30, 2, 20, 3, "Triptico", "oleo");
    public static Obra[] galeriaObras = {
        obra1,
        obra2,
        obra3,
        obra4
    };

    public static int buscarID(){
        int opcion;
        int i = 0;
        do{
            System.out.print("Introduce id de la obra: ");
            opcion = evitaErroresScannerI();
        }while(!(galeriaObras.length >= opcion && opcion > 0));

        while(i < galeriaObras.length && galeriaObras[i].getId() != opcion)
            i++;        
        return (i);
    }
    public static void mostrarObras(){
        System.out.println("ID  Nombre");
        for (int i = 0; galeriaObras.length > i; i++){
            System.out.println(galeriaObras[i].mostrarObrasToString());
        }
    }

    static void visualizarObras(){
        System.out.println("Id  Nombre    Autor   Tipo Precio Altura Peso Piezas Desc    Tecnica o Material");
        for(int i = 0; i < galeriaObras.length; i++){
            System.out.print(galeriaObras[i].visualizarObrasToString() + "      ");
            if (galeriaObras[i].getTipo() == "Escultura")
                System.out.print(((Escultura)galeriaObras[i]).toString());
            else if(galeriaObras[i].getTipo() == "Pintura")
                System.out.print(((Pintura)galeriaObras[i]).toString());
            System.out.println();
        }
    }
    static void visualizarObra(){
        mostrarObras();
        int id = buscarID();
        System.out.println(galeriaObras[id].visualizarObraToString());
    }
    
    static void obtenerPrecio(){
        int id = buscarID();
        galeriaObras[id].obtenerPrecio();
    }

    public static void imprimirEtiqueta(){
        mostrarObras();
        int id = buscarID();
        System.out.println(galeriaObras[id].imprimirEtiquetaToString());
    }

    public static void anadirObra(){
        Obra[] out = new Obra[galeriaObras.length + 1];
        Obra nuevaObra;
        Scanner sc = new Scanner(System.in);
        System.arraycopy(galeriaObras, 0, out, 0, galeriaObras.length);
        int calcularId = out.length;
        int tipo;
        do{
            System.out.print("Introduce el tipo de obra si es Escultura 1, si es Pintura 2: ");
            tipo = evitaErroresScannerI();
        }while(tipo != 1 && tipo != 2);
        System.out.print("Introduce el nombre de la obra: ");
        String nombre  = sc.nextLine();
        System.out.print("Introduce el autor de la obra: ");
        String autor  = sc.nextLine();
        System.out.print("Introduce el precio de la obra: ");
        double precio  = evitaErroresScannerD();
        System.out.print("Introduce el altura de la obra: ");
        double altura  = evitaErroresScannerD();
        System.out.print("Introduce el número de piezas de la obra: ");
        int piezas  = evitaErroresScannerI();
        System.out.print("Introduce el peso de la obra: ");
        double peso  = evitaErroresScannerD();
        System.out.print("Introduce la descripción de la obra: ");
        String desc  = sc.nextLine();
        if (tipo == 1){
            System.out.print("Introduce el material de la obra: ");
            String material  = sc.nextLine();
            nuevaObra = new Escultura(calcularId, "Escultura", nombre, autor, precio, altura, peso, piezas, desc, material);
            out[out.length - 1] = nuevaObra;
        }
        else if (tipo == 2){
            System.out.print("Introduce la tecnica de la obra: ");
            String tecnica  = sc.nextLine();
            nuevaObra = new Pintura(calcularId, "Pintura", nombre, autor, precio, altura, peso, piezas, desc, tecnica);
            out[out.length - 1] = nuevaObra;
        }
        galeriaObras = out;
    }

    public static void modificarObra(){
        final int TIPO_OBRA = 1;
        final int NOMBRE_OBRA = 2;
        final int AUTOR_OBRA = 3;
        final int PRECIO_OBRA = 4;
        final int ALTURA_OBRA = 5;
        final int PIEZAS_OBRA = 6;
        final int PESO_OBRA = 7;
        final int DESCRIPCION_OBRA = 8;
        final int MATERIAL_TECNICA = 9;
        final int FINALIZAR = 10;
        Scanner sc = new Scanner(System.in);
        int id = buscarID();
        int opcion;
        do {
            System.out.println(galeriaObras[id].visualizarObraToString());
            System.out.println("1. Modificar tipo");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Modificar autor");
            System.out.println("4. Modificar precio");
            System.out.println("5. Modificar altura");
            System.out.println("6. Modificar piezas");
            System.out.println("7. Modificar peso");
            System.out.println("8. Modificar descripción");
            System.out.println("9. Modificar técnica o material");
            System.out.println("10. Finalizar de modificar");
            System.out.print("Introduce opción: ");
            opcion = evitaErroresScannerI();
            switch(opcion)
            {
                case TIPO_OBRA:
                    System.out.println("Introduce nuevo tipo de la obra: ");
                    cambiarTipoObra(id);
                    break;
                case NOMBRE_OBRA:
                    System.out.print("Introduce nuevo nombre de la obra: ");
                    String nombre = sc.nextLine();
                    galeriaObras[id].setNombre(nombre);
                    break;
                case AUTOR_OBRA:
                    System.out.print("Introduce nuevo autor de la obra: ");
                    String autor = sc.nextLine();
                    galeriaObras[id].setAutor(autor);
                    break;
                case PRECIO_OBRA:
                    System.out.print("Introduce nuevo precio de la obra: ");
                    double precio = evitaErroresScannerD();
                    galeriaObras[id].setPrecio(precio);
                    break;
                case ALTURA_OBRA:
                    System.out.print("Introduce nueva altura de la obra: ");
                    double altura = evitaErroresScannerD();
                    galeriaObras[id].setAltura(altura);
                    break;
                case PIEZAS_OBRA:
                    System.out.print("Introduce nuevo número de piezas de la obra: ");
                    int piezas = evitaErroresScannerI();
                    galeriaObras[id].setPiezas(piezas);
                    break;
                case PESO_OBRA:
                    System.out.print("Introduce nuevo peso de la obra: ");
                    double peso = evitaErroresScannerD();
                    galeriaObras[id].setPeso(peso);
                    break;
                case DESCRIPCION_OBRA:
                    System.out.print("Introduce nuevo descripción de la obra: ");
                    String desc = sc.nextLine();
                    galeriaObras[id].setDesc(desc);
                    break;
                case MATERIAL_TECNICA:
                    if (galeriaObras[id].getTipo() == "Escultura"){
                        System.out.print("Introduce nuevo material de la obra: ");
                        String material = sc.nextLine();
                        ((Escultura)galeriaObras[id]).setMaterial(material);
                    }
                    else if (galeriaObras[id].getTipo() == "Pintura"){
                        System.out.print("Introduce nueva técnica de la obra: ");
                        String tecnica = sc.nextLine();
                        ((Pintura)galeriaObras[id]).setTecnica(tecnica);
                    }
                    break;
                default:
                System.out.println("Introduce numero valido: ");

            }
            
        } while (opcion != FINALIZAR);

    }

    public static void cambiarTipoObra(int id){
        Obra newObra = null;
        int opcion = 0;
        int put_id = galeriaObras[id].getId();
        String nombre = galeriaObras[id].getNombre();
        String autor = galeriaObras[id].getAutor();
        double precio = galeriaObras[id].getPrecio();
        double altura = galeriaObras[id].getAltura();
        int piezas = galeriaObras[id].getPiezas();
        double peso = galeriaObras[id].getPeso();
        String desc = galeriaObras[id].getDesc();

        System.out.println("La obra es tipo " + galeriaObras[id].getTipo());
        System.out.println("Si quiere cambiar de tipo escriba 1 si no 0: ");
        do{
            opcion = evitaErroresScannerI();
        }while(opcion != 1 && opcion != 0);
        if (opcion == 1){
            if (galeriaObras[id].getTipo() == "Escultura")
                newObra = new Pintura(put_id, "Pintura", nombre, autor, precio, altura, peso, piezas, desc, null);
            else if (galeriaObras[id].getTipo() == "Pintura")
                newObra = new Escultura(put_id, "Escultura", nombre, autor, precio, altura, peso, piezas, desc, null);
            galeriaObras[id] = newObra;
        }
    }

    public static double evitaErroresScannerD(){
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Error en la inserción de tipo de dato");
            System.out.print("Introduce dato: ");
            sc.nextLine();
            return evitaErroresScannerI();
        }
    }
    public static int evitaErroresScannerI(){
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Error en la inserción de tipo de dato");
            System.out.print("Introduce dato: ");
            sc.nextLine();
            return evitaErroresScannerI();
        }
    }
}
