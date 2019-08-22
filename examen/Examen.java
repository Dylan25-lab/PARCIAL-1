/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Usuario Dell
 */
import java.lang.reflect.Array;
import static java.time.Clock.system;
import java.util.Arrays;
import java.util.Scanner;
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        
        int CA1,CA2,CA3,CA4;
        int NO1,NO2,NO3,NO4;
        int [] notas= new int[4];
        int PROMEDIO;
        
        Scanner entrada= new Scanner(System.in);
        
        // TODO code application logic here
        
        System.out.println("Ingrese el Primer Carnet");
        CA1=reader.nextInt();
        System.out.println("Ingrese el nota del primer alumno");
        NO1=reader.nextInt();
        System.out.println("Ingrese el Segundo Carnet");
        CA2=reader.nextInt();
        System.out.println("Ingrese el nota del segundo alumno");
        NO2=reader.nextInt();
        System.out.println("Ingrese el Tercer Carnet");
        CA3=reader.nextInt();
        System.out.println("Ingrese el nota del tercer alumno");   
        NO3=reader.nextInt();
        System.out.println("Ingrese el Cuarto Carnet");
        CA4=reader.nextInt();
        System.out.println("Ingrese el nota del cuarto alumno");
        NO4=reader.nextInt();
        
        

        if(NO1>NO2&& NO1>NO3 && NO1>NO4)
        {
           System.out.println("El Alumno1 tuvo la mejor nota"+NO1+  "El cual posee el carnet:"+CA1);   
        }
        else if(NO2>NO1&& NO2>NO3 && NO2>NO4)
        {
        System.out.println("El Alumno2 tuvo la mejor nota"+NO2+   "El cual posee el carnet:"+CA2);     
        }
        else if(NO3>NO1&& NO3>NO2 && NO3>NO4)
        {
        System.out.println("El Alumno3 tuvo la mejor nota"+NO3+  "El cual posee el carnet:"+CA3);        
        }
        else
        {
        System.out.println("El Alumno4 tuvo la mejor nota:"+NO4+  "El cual posee el carnet:"+CA4);             
        }
        
        
        
        if(NO1<NO2&& NO1<NO3 && NO1<NO4)
        {
           System.out.println("El Alumno1 tuvo la menor nota"+NO1+  "El cual posee el carnet:"+CA1);   
        }
        else if(NO2<NO1&& NO2<NO3 && NO2<NO4)
        {
        System.out.println("El Alumno2 tuvo la menor nota"+NO2+   "El cual posee el carnet:"+CA2);     
        }
        else if(NO3<NO1&& NO3<NO2 && NO3<NO4)
        {
        System.out.println("El Alumno3 tuvo la menor nota"+NO3+  "El cual posee el carnet:"+CA3);        
        }
        else
        {
        System.out.println("El Alumno4 tuvo la menor nota:"+NO4+  "El cual posee el carnet:"+CA4);             
        }
        
        
        
        
        PROMEDIO=((NO1+NO2+NO3+NO4)/4);
        System.out.println("La nota promedio es:"+PROMEDIO);
        
        
        

    }
}
    
       