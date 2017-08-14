
package pruebacal;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.util.Scanner;
import java.awt.Robot;

public class TareaPracticaUno {
    PresentaciónDeIngreso ir = new PresentaciónDeIngreso();
    Menu2 ver = new Menu2();
    
    Scanner teclado = new Scanner(System.in);
    
    public void menuPresentacion(){
    int opciòn = 0;
    boolean salir = false;
    while(!salir){
        System.out.println("1. Menu Presentacion");
        System.out.println("2. Menu2");
        opciòn = teclado.nextInt();
        
        switch(opciòn){
            case 1:
                PresentaciónDeIngreso ha = new PresentaciónDeIngreso();
                
        
            java.awt.event.KeyEvent e = null;
            ha.keyTyped(e);
        
                     System.out.println("Nombre");
               System.out.println("Carné");
               System.out.println("IPC"+"'A'"+"Practica1");
               System.out.println("BUSCAMINAS!!!!");
            
     Menu2 muestra = new Menu2();
         char presioneEnter = e.getKeyChar();
         if(presioneEnter == KeyEvent.VK_ENTER){
             muestra.menu2(); 
         }
              break;
         
            case 2:
                ver.menu2();
                break;
        }//fin del switch
        
    }//fin del while
}//fin del método menuPresentaci+on
 public static void main(String[] args){
     PresentaciónDeIngreso mirar = new PresentaciónDeIngreso();
     
     
    TareaPracticaUno entrar = new TareaPracticaUno();
    entrar.menuPresentacion();
        
 }//fin del método mai
}//fin de la clase TareaPracticaUno

