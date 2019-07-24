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
 * @author anuar parejo, anderson ochoa
 */
public class UNIVERSIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <administrativo> admi = new ArrayList(); 
        ArrayList <Alumnos> alumnos = new ArrayList(); 
        boolean fin = false;  
        
        
        System.out.println("elija 1administrativo, 2alumnos, 3docente");
        int option = leer.nextInt();
        
        switch (option){
            case 1:
                while(!fin){                    
                    System.out.println("digite tipo  de documento");
                    String tipoDocumento = leer.next();
                    System.out.println("digite el documento");
                    String documento = leer.next();
                    System.out.println("digite apellido");
                    String apellido = leer.next();
                    System.out.println("digite nombre");
                    String nombre = leer.next();
                    System.out.println("digite edad");
                    int edad = leer.nextInt();
                    System.out.println(" digite estado 1.activo, 2.inactivo");
                    int ac = leer.nextInt();
                    if(ac == 1){
                        boolean activo = true;
                    }else{
                        boolean activo = false;
                    }
                    System.out.println("digite cargo");
                    String cargo = leer.next();
                    System.out.println("digite fecha contrato");
                    String Fcontrato = leer.next();
                    System.out.println("desea continuar 1.si, 2.no");
                    
                    int seguir = leer.nextInt();
                    if(seguir == 2){
                        fin = true;
                        }
                    for (i=0; i<administrativo.size(); i++){
                        System.out.println(admi.get(i).mostrar);}
                    
                    break;
                }
            case 2:
                while(!fin){                    
                    System.out.println("digite tipo  de documento");
                    String tipoDocumento = leer.next();
                    System.out.println("digite el documento");
                    String documento = leer.next();
                    System.out.println("digite apellido");
                    String appelido = leer.next();
                    System.out.println("digite nombre");
                    String nombre = leer.next();
                    System.out.println("digite edad");
                    int edad = leer.nextInt();
                    System.out.println("estado 1activo, 2inactivo");
                    int ac = leer.nextInt();
                    if(ac == 1){
                        boolean activo = true;
                    }else{
                        boolean activo = false;
                    }
                    System.out.println("digite codigo");
                    String codigo = leer.next();
                    System.out.println("digite facultad");
                    String facultad = leer.next();
                    System.out.println("digite programa");
                    String programa = leer.next();
                    System.out.println("digite semestre");
                    int semestre = leer.nextInt();
                    System.out.println("desea continuar 1si, 2no");
                    int seguir = leer.nextInt();
                    if(seguir == 2){
                        fin = true;
                    }
                }
                for (i=0; i<Alumnos.size(); i++){
                        System.out.println(alumnos.get(i).mostrar);}
            break;
            case 3: 
                ArrayList <Docente> docente = new ArrayList(); 
                ArrayList <catedraticos> catedraticos = new ArrayList(); 
                ArrayList <planta> planta = new ArrayList(); 
                System.out.println("digite 1catedratico, 2planta");
                int Docente = leer.nextInt();
                switch (Docente){
                    case 1:
                        ArrayList <catedraticos> catedratico = new ArrayList();
                            while(!fin){                    
                                System.out.println("digite tipo  de documento");
                                String tipoDocumento = leer.next();
                                System.out.println("digite el documento");
                                String documento = leer.next();
                                System.out.println("digite apellido");
                                String appelido = leer.next();
                                System.out.println("digite nombre");
                                String nombre = leer.next();
                                System.out.println("digite edad");
                                int edad = leer.nextInt();
                                System.out.println("estado 1activo, 2inactivo");
                                int ac = leer.nextInt();
                                if(ac == 1){
                                    boolean activo = true;
                                }else{
                                    boolean activo = false;
                                }
                                System.out.println("digite profesion");
                                String profesion = leer.next();
                                System.out.println("digite asignatura");
                                String asignatura = leer.next();
                                System.out.println("digite fecha Incio");
                                String fInicio = leer.next();
                                System.out.println("digite fecha Fin");
                                String fFin = leer.next();
                                System.out.println("desea continuar 1si, 2no");
                                int seguir = leer.nextInt();
                                if(seguir == 2){
                                    fin = true;
                                }
                            } 
                             for (i=0; i<catedraticos.size(); i++){
                        System.out.println(catedratico.get(i).mostrar);}
                    break;
                    case 2:
                            while(!fin){                    
                                System.out.println("ingrese tipo  de documento");
                                String tipoDocumento = leer.next();
                                System.out.println("ingrese el documento");
                                String documento = leer.next();
                                System.out.println("ingrese apellido");
                                String apellido = leer.next();
                                System.out.println("ingrese nombre");
                                String nombre = leer.next();
                                System.out.println("ingrese edad");
                                int edad = leer.nextInt();
                                System.out.println("estado 1activo 2inactivo");
                                int ac = leer.nextInt();
                                if(ac == 1){
                                    boolean activo = true;
                                }else{
                                    boolean activo = false;
                                }
                                System.out.println("Ingrese la profesion");
                                String profesion = leer.next();
                                System.out.println("Ingrese la asignatura");
                                String asignatura = leer.next();
                                System.out.println("Ingrese la Fecha de Contrato");
                                String fechaContrato = leer.next();
                                System.out.println("Ingrese la cantidad de proyectos");
                                int cantProyectos = leer.nextInt();
                                System.out.println("desea continuar 1si 2no");
                                int c = leer.nextInt();
                                if(c == 2){
                                    fin = true;
                                }
                            }
                            for (i=0; i<planta.size(); i++){
                        System.out.println(planta.get(i).mostrar);}
                    break;    
                }               
            break;        
        
        
        }}}

    

    
                
                
                
   
    

