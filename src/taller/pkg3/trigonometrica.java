
package taller.pkg3;

import java.util.Scanner;


public class trigonometrica {
    
    public static double trigonometricas(){
        

    Double result;
    Scanner reader = new Scanner(System.in);
    
       String seguir;
       do{
           
        System.out.println("Estas en la opcion Trigonométrica");
        System.out.println("Seleccione la opción que desea realizar");
        System.out.println("1. Seno");
        System.out.println("2. Coseno");
        System.out.println("3. Tangente");
        System.out.println("4. Secante");
        int opcionTrigonometrica = reader.nextInt();
        System.out.println("Digita el numero (en grados)");
        int numRadian = reader.nextInt();
        double num = (numRadian/57.295779513);
      
        switch(opcionTrigonometrica){
            case 1:    result = Math.sin(num); 
               System.out.println("EL RESULTADO ES "+ result);
                break;
            case 2:    result = Math.cos(num); 
               System.out.println("EL RESULTADO ES "+ result);
                break;
            case 3:    result = Math.tan(num); 
               System.out.println("EL RESULTADO ES "+ result);
                break;
            case 4:   result = 1/(Math.sin(num)); 
               System.out.println("EL RESULTADO ES "+ result);
                break;
            default: System.out.println("Opción No valida");
                     break;
                      
    }  
    
        System.out.println("Desea continuar Si/No");
        seguir = reader.next();
        seguir = seguir.toLowerCase();
        }while(seguir.equals("si"));
       
        return 0;
        
          }
       
    }                    
        

    
       
                        
        