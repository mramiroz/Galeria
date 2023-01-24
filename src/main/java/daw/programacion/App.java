package daw.programacion;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int i;
        do
        {
            System.out.println("1. Visualizar las obras de arte existentes en la galeria");
            System.out.println("2. Dar de alta una nueva obra de arte");
            System.out.println("3. Modificar los datos de una de las obras de arte expuestas");
            System.out.println("4. Visualizar los datos de una de las obras de arte expuestas");
            System.out.println("5. Obtener el precio de venta de una de las obras de arte expuestas");
            System.out.println("6. Imprimier una etiqueta");
            System.out.println("7. Salir del programa");
            System.out.print("Introduce el número de la funcionalidad: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            i = num;
            switch(num)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break ;
                default:
                    System.out.println("Introduzca un numero valido");
            }
        }while(i != 7);
    }
}
