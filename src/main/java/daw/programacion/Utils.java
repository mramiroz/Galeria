package daw.programacion;

import java.util.Scanner;

public class Utils {
    public static int buscarID(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.print("Introduce id de la obra: ");
            opcion = sc.nextInt();
        }while(!(Data.arr.length >= opcion && opcion > 0));
        int i = 0;
        while(i < Data.arr.length && Data.arr[i].getId() != opcion){
            i++;
        }
        return (i);
    }
    public static void mostrarObras(){
        System.out.println("ID  Nombre");
        for (int i = 0; Data.arr.length > i; i++){
            System.out.println(Data.arr[i].mostrarObrasToString());
        }
    }
}
