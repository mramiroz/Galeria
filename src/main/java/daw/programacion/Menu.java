package daw.programacion;

import java.util.InputMismatchException;
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
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1. Visualizar las obras de arte existentes en la galeria");
            System.out.println("2. Dar de alta una nueva obra de arte");
            System.out.println("3. Modificar los datos de una de las obras de arte expuestas");
            System.out.println("4. Visualizar los datos de una de las obras de arte expuestas");
            System.out.println("5. Obtener el precio de venta de una de las obras de arte expuestas");
            System.out.println("6. Imprimir una etiqueta");
            System.out.println("7. Salir del programa");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("Introduce el número de la funcionalidad: ");
            try{
                opcion = sc.nextInt();
            }
            catch (InputMismatchException ime){
                System.out.println("Error en la inserción de tipo de dato");
                sc.next();
            }
            switch(opcion)
            {
                case VISUALIZAR_TODO:
                    Galeria.visualizarObras();
                    break;
                case ALTA:
                    Galeria.anadirObra();
                    break;
                case MODIFICAR:
                    Galeria.modificarObra();
                    break;
                case VISUALIZAR_UNA:
                    Galeria.visualizarObra();
                    break;
                case OBTENER_PRECIO:
                    Galeria.obtenerPrecio();
                    break;
                case IMPRIMIR:
                    Galeria.imprimirEtiqueta();
                    break;
                case FINALIZAR:
                    break ;
                default:
                System.out.println("Introduzca un numero valido");
            }
        }while(opcion != FINALIZAR);
    }
}
