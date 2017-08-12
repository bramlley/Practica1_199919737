
package pruebacal;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.util.Scanner;
import java.awt.Robot;
public class TareaPracticaUno {
    
       Menu2 ir = new Menu2();
       
    public void enter() throws AWTException{
          Scanner entrada = new Scanner(System.in);
             boolean salir = false;
        int opcion = 0;
        while(!salir){
            
     System.out.println("1.opcion");
     System.out.println("2.opcion");
   opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                System.out.println("Nombre");
                System.out.println("Carné");
                System.out.println("IPC"+"'A'"+"Practica1");
                System.out.println("BUSCAMINAS!!!!");
                 System.out.println();
                 
               ClaseEventos presione = new ClaseEventos();
             
               
                 break;
                 
                case 2: 
                   ir.menu2();
                    break;
                case 3: 
                    salir = true;
                    break;
            
            }//fin del case
        }//fin del while
    
    }
    public static void main(String[] args) throws AWTException{
        TareaPracticaUno ir = new TareaPracticaUno();
        ir.enter();
 
 }//fin del método mai
}//fin de la clase TareaPracticaUno

