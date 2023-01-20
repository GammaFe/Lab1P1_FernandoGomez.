
package lab1p1_fernandogomez;

/**
 *
 * @author Fernando_Jose
 */
import java.util.Scanner;
public class Lab1P1_FernandoGomez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        //  != significa distinto que
        while ( opcion != 4 ){
            System.out.println("Menu");
            System.out.println("1. Socios");
            System.out.println("2. Determinar mayor");
            System.out.println("3. Triangulo o no");
            System.out.println("4. Salir");
            
            
            opcion = entrada.nextInt();
            
            if (opcion == 1){
                int grado = -1;
                float total = 0.0f;
                int repetir = 1;
                
                while(repetir != 0 ){
                    System.out.print("Ingrese el grado del socio: ");
                    grado = entrada.nextInt();
                    System.out.print("Ingrese el total de la compra: ");
                    total = entrada.nextFloat();
                    //1 - porcentaje
                    if (grado == 0){
                        total = total;
                    }else if (grado == 1) {
                        total = 0.9f * total;
                        }else if (grado == 2) {
                        total = 0.85f * total;
                        }else if (grado == 3) {
                        total = 0.75f * total;
                        } else {
                            System.out.println("El grado ingresado no es valido. ");
                    } 
                    System.out.println("Total a pagar:  "+total);
                    System.out.println("Dese calcular el total a pagar de otro cliente? 0/n 1/s ");
                    repetir = entrada.nextInt();
                }        
            }else if (opcion == 2){
                int num = 0, num2 = 0;
                int resp = 1;
                while (resp != 0){
                System.out.print("Ingrese un numero entero:");
                num =entrada.nextInt();
                System.out.println(" desea ingresar otro? [1:s / 0:n]");
                resp = entrada.nextInt();
                if (num >= num2){
                    num2 = num;
                }    
                } 
                System.out.println("El numero mayor fue "+ num2);
                }else if (opcion == 3){
                    int a ,b,c;
                    int resp2 = 1;
                    while (resp2 != 0){
                    System.out.print("Ingrese a: ");
                    a= entrada.nextInt();
                    System.out.print("Ingrese b: ");
                    b= entrada.nextInt();
                    System.out.print("Ingrese c: ");
                    c= entrada.nextInt();
                    
                    if ( (a+b>c) && (c+b>a)&&(a+c>b)){
                        System.out.println("Los lados SI forman un triangulo."); 
                    }else{
                        System.out.println("Los lados NO forman un triangulo.");
                    }
                    
                        System.out.println("Desea ingresar otras longitudes? {0 para no cualquier otro numeor prar si}: ");
                        resp2 = entrada.nextInt();
                    }
                    }else if (opcion == 4){
                        System.out.println("Terminando el programa");
                        }else{
                        System.out.println("La opcion ingresada no es valida. ");
            }
        }
        
    }
    
}


