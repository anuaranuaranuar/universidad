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
        // Crear pacientes
        Scanner leer = new Scanner(System.in);
        ArrayList<String> nombres=new ArrayList();
        ArrayList<Integer> salarioDia = new ArrayList();
        ArrayList<Integer> dia = new ArrayList();
        ArrayList<Integer> total = new ArrayList();

        // Agregar pacientes a una lista
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
        pacientes.add(paciente6);

        // Imprimir datos de los pacientes (usando un loop For-each introducido en "Java 8")
        System.out.println("Todos los pacientes:");
        for (Paciente pacienteActual : pacientes) {
            System.out.println(pacienteActual.getId() + ", " + 
                    pacienteActual.getNombre() + ", " + 
                    pacienteActual.getApellido() + ", " + 
                    pacienteActual.getEdad() + ", " + 
                    pacienteActual.getDireccion() + ", " + 
                    pacienteActual.getTelefono());
        }

        // Obtener los datos del paciente con el ID = 4
        System.out.println("\nPaciente con el ID = 4:");
        System.out.println(pacientes.get(3).getId() + ", " +
                pacientes.get(3).getNombre() + ", " +
                pacientes.get(3).getApellido() + ", " + 
                pacientes.get(3).getEdad() + ", " + 
                pacientes.get(3).getDireccion() + ", " + 
                pacientes.get(3).getTelefono());

        // Modificar el nombre del paciente con el ID = 2 e imprimirlo
        System.out.println("\nNombre nuevo del paciente con el ID = 2:");
        pacientes.get(1).setNombre("Nuevo nombre");
        System.out.println(pacientes.get(1).getId() + ", " + pacientes.get(1).getNombre());

        // Modificando los datos de todos los pacientes
        for (Paciente pacienteActual : pacientes) {
            pacienteActual.setId(11);
            pacienteActual.setNombre("Otro1");
            pacienteActual.setApellido("Otro");
            pacienteActual.setEdad(51);
            pacienteActual.setDireccion("Nueva");
            pacienteActual.setTelefono(123456);
        }

        // Vaciar la lista de pacientes
        pacientes.clear();
        System.out.println("\nTamaño de la lista: " + pacientes.size());
    }
}
                
                
                
   
    

