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
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Id  Nombre    Autor   Tipo Precio Altura Peso Piezas Desc");
        for(int i = 0; i < galeriaObras.length; i++){
            System.out.println(galeriaObras[i].visualizarObrasToString());
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
        sc.nextLine();
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
        sc.nextLine();
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
        Scanner sc = new Scanner(System.in);
        int id = buscarID();
        int opcion;
        do {
            System.out.println("1. Modificar nombre");
            System.out.println("2. Modificar autor");
            System.out.println("3. Modificar precio");
            System.out.println("4. Modificar altura");
            System.out.println("5. Modificar piezas");
            System.out.println("6. Modificar peso");
            System.out.println("7. Modificar descripción");
            opcion = sc.nextInt();
            switch(opcion)
            {
                case 1:
                    String nombre = sc.nextLine();
                    galeriaObras[id].setNombre(nombre);
                    break;
                case 2:
                    String autor = sc.nextLine();
                    galeriaObras[id].setAutor(autor);
                    break;
                case 3:
                    int precio = sc.nextInt();
                    galeriaObras[id].setPrecio(precio);
                    break;
                case 4:
                    int altura = sc.nextInt();
                    galeriaObras[id].setAltura(altura);
                    break;
                case 5:
                    int piezas = sc.nextInt();
                    galeriaObras[id].setPiezas(piezas);
                    break;
                case 6:
                    int peso = sc.nextInt();
                    galeriaObras[id].setPeso(sc.nextInt(peso));
                    break;
                case 7:
                    String desc = sc.nextLine();
                    galeriaObras[id].setDesc(desc);
                    break;
            }
            
        } while (opcion != 8);

    }

    public static double evitaErroresScannerD(){
        Scanner sc = new Scanner(System.in);
        double output = 0;
        int control = 0;
        do {
            try{
                output = sc.nextDouble();
                control = 1;
            }
            catch (InputMismatchException ime){
                System.out.println("Error en la inserción de tipo de dato");
                System.out.println("Introduce dato: ");
                continue;
            }
        }while(control == 0);

        return (output);
    }
    public static int evitaErroresScannerI(){
        Scanner sc = new Scanner(System.in);
        int output = 0;
        int control = 0;
        do {
            try{
                output = sc.nextInt();
                control = 1;
            }
            catch (InputMismatchException ime){
                System.out.println("Error en la inserción de tipo de dato");
                System.out.print("Introduce dato: ");
                sc.next();
                continue;
            }
        }while(control == 0);

        return (output);
    }
}
