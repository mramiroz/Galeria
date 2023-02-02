package daw.programacion;

import java.util.Scanner;

public class Data {
    static Obra obra1 = new Escultura(001, "Escultura", "David", "Miguel Angel", 30, 2, 20, 5,"Obra Renacimiento", "marmol");
    static Obra obra2 = new Escultura(002, "Escultura", "Medusa", "Donatello", 30, 2, 20, 1,"Obra renacimiento", "metal");
    static Obra obra3 = new Pintura(003, "Pintura", "Guernica", "Picasso", 30, 2, 20, 1, "Guerra Civil española", "oleo");
    static Obra obra4 = new Pintura(004, "Pintura", "Tres delicias", "Bosco", 30, 2, 20, 3, "Triptico", "oleo");
    public static Obra[] arr = {
        obra1,
        obra2,
        obra3,
        obra4
    };

    public static void anadirObra(){
        Obra[] out = new Obra[arr.length + 1];
        Obra nuevaObra;
        Scanner sc = new Scanner(System.in);
        System.arraycopy(arr, 0, out, 0, arr.length);
        int calcularId = out.length;
        int tipo;
        do{
            System.out.print("Introduce el tipo de obra si es Escultura 1, si es Pintura 2: ");
            tipo = sc.nextInt();
        }while(tipo != 1 && tipo != 2);
        sc.nextLine();
        System.out.print("Introduce el nombre de la obra: ");
        String nombre  = sc.nextLine();
        System.out.print("Introduce el autor de la obra: ");
        String autor  = sc.nextLine();
        System.out.print("Introduce el precio de la obra: ");
        double precio  = sc.nextDouble();
        System.out.print("Introduce el altura de la obra: ");
        double altura  = sc.nextDouble();
        System.out.print("Introduce el número de piezas de la obra: ");
        int piezas  = sc.nextInt();
        System.out.print("Introduce el peso de la obra: ");
        double peso  = sc.nextDouble();
        sc.nextLine();
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
        arr = out;
    }
}
