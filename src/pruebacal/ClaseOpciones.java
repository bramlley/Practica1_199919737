
package pruebacal;

import java.util.Scanner;

/**
 *Estas son las opciones para los menus del
 * juego principiante, intermedio y experto
 * autor Williams Constanza
 */
public class ClaseOpciones {
    Scanner teclado = new Scanner(System.in);
     public void dameMenuJuego(){
    int opción = 0;
    boolean salir = false;
    
    while(!salir){
    System.out.println();
    System.out.println("--------------------");    
    System.out.println("Voltear: V");
    System.out.println("Reiniciar: R");
    System.out.println("Salir: S");
    System.out.println();
    System.out.println("Ingresar Opción:");
    opción = teclado.nextInt();
    System.out.println("--------------------");
    
    switch(opción){
        case 1: break;
        case 2: break;
        case 3: break;
    }//fin del switch
  }//fin del while
 }//fin del método dameJuego
}//fin de la clase ClaseOpciones
    

