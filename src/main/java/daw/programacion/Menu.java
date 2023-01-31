package daw.programacion;

import java.util.Scanner;

public class Menu {
    public static void indice(){
        final int VISUALIZAR_TODO = 1;
        final int ALTA = 2;
        final int MODIFICAR = 3;
        final int VISUALIZAR_UNA = 4;
        final int OBTENER_PRECIO = 5;
        final int IMPRIMIR = 6;
        final int FINALIZAR = 7;
        int opcion;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1. Visualizar las obras de arte existentes en la galeria>");
            System.out.println("2. Dar de alta una nueva obra de arte");
            System.out.println("3. Modificar los datos de una de las obras de arte expuestas");
            System.out.println("4. Visualizar los datos de una de las obras de arte expuestas");
            System.out.println("5. Obtener el precio de venta de una de las obras de arte expuestas");
            System.out.println("6. Imprimir una etiqueta");
            System.out.println("7. Salir del programa");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("Introduce el número de la funcionalidad: ");
            opcion = sc.nextInt();
            switch(opcion)
            {
                case VISUALIZAR_TODO:
                case ALTA:
                    Data.anadirObra();
                    break;
                case MODIFICAR:
                case VISUALIZAR_UNA:
                    visualizarObra();
                    break;
                case OBTENER_PRECIO:
                case IMPRIMIR:
                case FINALIZAR:
                    break ;
                default:
                    System.out.println("Introduzca un numero valido");
            }
        }while(opcion != FINALIZAR);
    }


    private static void visualizarObra(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce id de la obra: ");
        int opcion = sc.nextInt();
        int i = 0;
        while(i < Data.arr.length && Data.arr[i].getId() != opcion){
            i++;
        }

        System.out.println("Nombre: " + Data.arr[i].getNombre());
        System.out.println("Autor: " + Data.arr[i].getAutor());
        System.out.println("Precio: " + Data.arr[i].getPrecio());
        System.out.println("Altura: " + Data.arr[i].getAltura());
        System.out.println("Peso: " + Data.arr[i].getPeso());
        System.out.println("Número de piezas: " + Data.arr[i].getPeso());
        System.out.println("Descripcion: " + Data.arr[i].getPiezas());
    }
}
