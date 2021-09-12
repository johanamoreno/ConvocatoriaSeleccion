/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatoria;

import java.util.Scanner;
import jugador.Jugador;

/**
 *
 * @author Usuario
 */
public class Convocatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        int opcion;
        int contador=0;
        int consultar;
        int editar;
        
        Jugador[] jugadores= new Jugador[23];
        
        do {
            System.out.println("-----------------------------------");
            System.out.println("BIENVENIDO A LA CONVOCATORIA");
            System.out.println("  DE LA SELECCION COLOMBIA");
            System.out.println("-----------------------------------");
            
            System.out.println("1. Agregar jugador a convocar ");
            System.out.println("2. Buscar jugador convocado ");
            System.out.println("3. Editar jugador convocado");
            System.out.println("4. Mostrar la convocatoria");
            System.out.println("5. Salir de la convocatoria");
            System.out.println("-----------------------------------");
            System.out.println("DIGITE UNA DE LAS OPCIONES DEL MENU");
            System.out.println("-----------------------------------");
            opcion=entrada.nextInt();
        
        switch (opcion){
        
            case 1:System.out.println("REGISTRO DEL JUGADOR A CONVOCAR: ");
                   System.out.println("--------------------------------");
                
                jugadores[contador]=new Jugador();
                jugadores[contador].setCamisa(contador);
                System.out.println("--------------------------------");
                System.out.println("DIGITE EL NUMERO DE CAMISA DEL JUGADOR");
                jugadores[contador].setCamisa(entrada.nextInt());
                System.out.println("DIGITE EL NOMBRE DEL JUGADOR: ");
                jugadores[contador].setNombre(entrada.next());
                System.out.println("--------------------------------");
                System.out.println("DIGITE EL APELLIDO DEL JUGADOR: ");
                jugadores[contador].setApellido(entrada.next());
                System.out.println("--------------------------------");
                System.out.println("DIGITE LA POSICION DEL JUGADOR: ");
                jugadores[contador].setPosicion(entrada.next());
                System.out.println("--------------------------------");
                System.out.println("DIGITE LA EDAD DEL JUGADOR: ");
                jugadores[contador].setEdad(entrada.nextInt());
                System.out.println("--------------------------------");
                System.out.println("DIGITE EL EQUIPO DEL JUGADOR: ");
                jugadores[contador].setEquipo(entrada.next());
                System.out.println("--------------------------------");
                contador++;
                
                break;
            case 2: System.out.println("CONSULTAR JUGADOR CONVOCADO");
                    System.out.println("DIGITE EL NUMERO DE CAMISA DEL JUGADOR A CONSULTAR: ");
                    consultar=entrada.nextInt();
                    
                                   
                    for (int i=0; i<contador; i++){
                        
                    if(consultar==jugadores[i].getCamisa()){
                     
                    System.out.println("CAMISA: "+jugadores[i].getCamisa());    
                    System.out.println("NOMBRE: "+jugadores[i].getNombre());
                    System.out.println("APELLIDO: "+jugadores[i].getApellido());
                    System.out.println("POSICION: "+jugadores[i].getPosicion());
                    System.out.println("EDAD: "+jugadores[i].getEdad());
                    System.out.println("EQUIPO: "+jugadores[i].getEquipo());
                    
                    break;
                    
                    }else{System.out.println("EL JUGADOR NO HA SIDO CONVOCADO");}     
                    }
                    
                    break;
            case 3: System.out.println("EDITAR JUGADOR CONVOCADO: "); 
                    System.out.println("DIGITE EL NUMERO DE CAMISA DEL JUGADOR A EDITAR: ");
                    editar=entrada.nextInt();
                                        
                    for (int i=0; i<contador; i++){
                        
                    if(editar==jugadores[i].getCamisa()){
                    System.out.println("EL NUMERO DE CAMISA ACTUAL ES: "+jugadores[i].getCamisa()); 
                    System.out.println("EDITE EL NUMERO DE CAMISA DEL JUGADOR:");
                    jugadores[i].setCamisa(entrada.nextInt());
                    System.out.println("--------------------------------");
                    System.out.println("EL NOMBRE ACTUALN ES: "+jugadores[i].getNombre());
                    System.out.println("EDITE EL NOMBRE DEL JUGADOR: ");
                    jugadores[i].setNombre(entrada.next());
                    System.out.println("--------------------------------");
                    System.out.println("EL APELLIDO ACTUAL ES: "+jugadores[i].getApellido());
                    System.out.println("EDITE EL APELLIDO DEL JUGADOR: ");
                    jugadores[i].setApellido(entrada.next());
                    System.out.println("--------------------------------");
                    System.out.println("LA POSICION ACTUAL ES: "+jugadores[i].getPosicion());
                    System.out.println("EDITE LA POSICION DEL JUGADOR: ");
                    jugadores[i].setPosicion(entrada.next());
                    System.out.println("--------------------------------");
                    System.out.println("LA EDAD ACTUAL ES: "+jugadores[i].getEdad());
                    System.out.println("EDITE LA EDAD DEL JUGADOR: ");
                    jugadores[i].setEdad(entrada.nextInt());
                    System.out.println("--------------------------------");
                    System.out.println("EL EQUIPO ACTUAL ES: "+jugadores[i].getEquipo());
                    System.out.println("EDITE EL EQUIPO DEL JUGADOR: ");
                    jugadores[i].setEquipo(entrada.next());
                    System.out.println("--------------------------------");  
                        
                break;
                    
                    }else{System.out.println("EL JUGADOR NO HA SIDO CONVOCADO");}     
                    }
                    
                break;
                    
            case 4: System.out.println("CONSULTA GLOBAL DE LA CONVOCATORIA: ");
                    System.out.println("");
                
                for(int i=0; i<contador; i++){
                    System.out.println("CAMISA:" +jugadores[i].getCamisa());
                    System.out.println("NOMBRE:" +jugadores[i].getNombre());
                    System.out.println("APELLIDO:" +jugadores[i].getApellido());
                    System.out.println("POSICION:" +jugadores[i].getPosicion());
                    System.out.println("EDAD:" +jugadores[i].getEdad());
                    System.out.println("EQUIPO:" +jugadores[i].getEquipo());
                    System.out.println("-----------------------------");
                }
                break;
            case 5: System.exit(0);
                break;
                
            default:
                break;
        
        }  
        }while(opcion!=5);
        
        
    }
    
    }
