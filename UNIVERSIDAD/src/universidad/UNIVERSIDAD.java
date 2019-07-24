/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class UNIVERSIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      ArrayList<Alumnos> Alumnos = new ArrayList<Alumnos>();
      ArrayList<Docente> Docente = new ArrayList<Docente>();
      ArrayList<administrativo> administrativo = new ArrayList<administrativo>();
      ArrayList<catedraticos> catedraticos = new ArrayList<catedraticos>();
      ArrayList<personal> personal = new ArrayList<personal>();
      ArrayList<planta> planta = new ArrayList<planta>();
      int deci,ac,decision,accion=1;
      
      System.out.println("Elige el tipo de usuario (1.Docente,2.Alumnos,3.Administrativos)");
      deci=leer.nextInt();
      switch(deci){
          case 1:
              System.out.println("1.Catedratico, 2.Planta");
              decision=leer.nextInt();
              if(decision==1){
              System.out.println("1.Agrega, 2.Modifica, 3.Elimina");
              ac=leer.nextInt();
              if(ac==1){
                  while(accion!=0){
                      System.out.println("Ingrese el nombre del catedratico");
                      catedraticos.add(new catedraticos(leer.next( )));
                  }
              }
              if(decision==2){
              System.out.println("1.Agregar");
              System.out.println("2.Modificar");
              System.out.println("3.Eliminar");
              deci=leer.nextInt();   
              }
              break;
          case 2:
              System.out.println("1.Agregar");
              System.out.println("2.Modificar");
              System.out.println("3.Eliminar");
              acc=leer.nextInt();
              break;
          case 3:
              System.out.println("1.Agregar");
              System.out.println("2.Modificar");
              System.out.println("3.Eliminar");
              acc=leer.nextInt();
              break;
            }
       }
         
    }}
                
                
                
   
    

