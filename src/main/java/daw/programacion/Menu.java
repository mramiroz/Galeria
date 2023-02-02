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
            System.out.println("1. Visualizar las obras de arte existentes en la galeria");
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
                    visualizarObras();
                    break;
                case ALTA:
                    Data.anadirObra();
                    break;
                case MODIFICAR:
                case VISUALIZAR_UNA:
                    visualizarObra();
                    break;
                case OBTENER_PRECIO:
                    obtenerPrecio();
                    break;
                case IMPRIMIR:
                    imprimirEtiqueta();
                    break;
                case FINALIZAR:
                    break ;
                default:
                System.out.println("Introduzca un numero valido");
            }
        }while(opcion != FINALIZAR);
    }

    private static void visualizarObras(){
        System.out.println("Id  Nombre    Autor   Tipo Precio Altura Peso Piezas Desc");
        for(int i = 0; i < Data.arr.length; i++){
            System.out.println(Data.arr[i].visualizarObrasToString());
        }
    }

    private static void visualizarObra(){
        Utils.mostrarObras();
        int id = Utils.buscarID();
        System.out.println(Data.arr[id].visualizarObraToString());
        
    }

    private static void obtenerPrecio(){
        int id = Utils.buscarID();
        Precio.obtenerPrecioObra(Data.arr[id]);

    }

    private static void imprimirEtiqueta(){
        Utils.mostrarObras();
        int id = Utils.buscarID();
        System.out.println(Data.arr[id].imprimirEtiquetaToString());
    }
}
