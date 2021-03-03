/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras_60223;
import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class NumLetras_60223 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num= 0;
        
        System.out.println("ingrese un número del 0 al 99" );
        num = sc.nextInt();
        
        int dece = (((num % 100) % 100) / 10);
        int unid = (num  % 10 ) ;
        String decena = "";
        String unidad = "";
        
        
        
         if ( num <10  && num >= 0){
           switch(num) {
            case 0: 
                unidad = "cero";
                break;
            case 1:
                unidad = "uno";
                break;
            case 2:
                unidad = "dos";;
                break;
            case 3:
                unidad = "tres";
                break;
            case 4:
                unidad = "cuatro";
                break;
            case 5:
                unidad = "cinco";
                break;
            case 6:
                unidad = "seis";
                break;
            case 7:
                unidad = "siete";
            break;
                case 8:
                unidad = "ocho";
                break;
            case 9:
                unidad = "nueve";
                break;
            default: 
                throw new AssertionError();
         }      
           System.out.println(""+ unidad); 
        }
        else{
           switch(unid) {
            case 0: 
                unidad = "cero";
                break;
            case 1:
                unidad = "uno";
                break;
            case 2:
                unidad = "dos";
                break;
            case 3:
                unidad = "tres";
                break;
            case 4:
                unidad = "cuatro";
                break;
            case 5:
                unidad = "cinco";
                break;
            case 6:
                unidad = "sies";
                break;
            case 7:
                unidad = "siete";
                break;
            case 8:
                unidad = "ocho";
                break;
            case 9:
                unidad = "nueve";
                break;
            default: 
                throw new AssertionError();
           
         
             
        }
        switch(dece) {
             case 1: 
                 decena = "Diez";
                    switch(unid) {
                     case 0:
                         decena = "diez";
                         unidad = "";
                        break;
                     case 1:
                         decena = "once";
                         unidad = "";
                         break;
                      case 2:
                         decena = "doce";
                         unidad = "";
                         break;
                     case 3: 
                         decena = "trece";
                         unidad = "";
                        break;
                     case 4: 
                          decena = "catorce";
                          unidad = " ";
                         break;  
                     case 5: 
                         decena = "quince";
                         unidad = "";
                         break;
                         default:
                         decena = "Dieci";
                     }
                     break;
          case 2 :
             decena = "veinte";
             switch(unid) {
                 case 0: 
                 decena = "veinte";
                 unidad = "";
                 break;
             default:
                decena = "Veinti";
             }
             break;
              case 3 :
             decena = "treinta";
             switch(unid) {
                 case 0: 
                 decena = "treinta";
                 unidad = "";
                 break;
             default:
                decena = "Treinta y ";
             }
             break;
              case 4 :
             decena = "cuarenta";
             switch(unid) {
                 case 0: 
                  decena = "cuarenta";
                 unidad = "";
                 break;
             default:
                decena = "Cuarenta y ";
             }
             break;
              case 5 :
             decena = "Cincuenta";
             switch(unid) {
                 case 0: 
                  decena = "cincuenta";
                 unidad = "";
                 break;
             default:
                decena = "Cincuenta y ";
             }
             break;
              case 6 :
             decena = "sesenta";
             switch(unid) {
                 case 0: 
                 decena = "sesenta";
                 unidad = "";
                 break;
             default:
                decena = "sesenta y ";
             }
             break;
              case 7 :
             decena = "setenta";
             switch(unid) {
                 case 0: 
                  decena = "setenta";
                 unidad = "";
                 break;
             default:
                decena = "Setenta y" ;
             }
             break;
              case 8 :
             decena = "Ochenta";
             switch(unid) {
                 case 0: 
                  decena = "ochenta";
                 unidad = "";
                 break;
             default:
                decena = "ochenta y ";
             }
             break;
              case 9 :
             decena = "noventa";
             switch(unid) {
                 case 0: 
                  decena = "noventa";
                 unidad = "";
                 break;
             default:
                decena = "noventa y ";
             }
                 break;
                   default: 
                   throw new AssertionError();
             }
             
        
        
                
        System.out.println(decena + ""+ unidad);   
                 
                 
                 
                 
                 
        }
        }
}

    

 
 




                     
                 
              
                         
              
             
             
        
                
                    
                
        
    

    

