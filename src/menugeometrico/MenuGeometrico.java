/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menugeometrico;
/**
 *
 * @author David Castro-Paola Joya
 */
import java.util.*;
public class MenuGeometrico {
    public double cordenadaXP1,cordenadaYP1,cordenadaXP2,cordenadaYP2,cordenadaXP3,
            cordenadaYP3,cordenadaXP4,cordenadaYP4; 
    public void seleccion(){   
     Scanner figura=new Scanner (System.in);
     Scanner lectura=new Scanner (System.in);
     int caso;
     do{
     System.out.println("Escoja una figura: (1)-Triangulo  (2)-Circulo (3)-Cuadrado (4)-Rectangulo");
     caso=figura.nextInt();
     switch(caso){
        case 1: 
                    System.out.println("Digite la cordenada x del punto 1 :");
                    cordenadaXP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 1 :");
                    cordenadaYP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 2 :");
                    cordenadaXP2=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 2 :");
                    cordenadaYP2=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 3 :");
                    cordenadaXP3=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 3 :");
                    cordenadaYP3=lectura.nextDouble();
                    Triangulo t=new Triangulo(cordenadaXP3,cordenadaYP3,cordenadaXP1,cordenadaXP2,cordenadaYP1,cordenadaYP2);
                    t.imprimir();
               break;
        case 2: 
                    System.out.println("Digite la cordenada x del punto 1 :");
                    cordenadaXP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 1 :");
                    cordenadaYP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 2 :");
                    cordenadaXP2=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 2 :");
                    cordenadaYP2=lectura.nextDouble();
                    Circulo c=new Circulo(cordenadaXP1,cordenadaXP2,cordenadaYP1,cordenadaYP2);
                    c.imprimir();
               break;
        case 3:
                    System.out.println("Digite la cordenada x del punto 1 :");
                    cordenadaXP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 1 :");
                    cordenadaYP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 2 :");
                    cordenadaXP2=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 2 :");
                    cordenadaYP2=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 3 :");
                    cordenadaXP3=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 3 :");
                    cordenadaYP3=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 4 :");
                    cordenadaXP4=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 4 :");
                    cordenadaYP4=lectura.nextDouble(); 
                    Cuadrado cu=new Cuadrado(cordenadaXP3,cordenadaYP3,cordenadaXP4,cordenadaYP4,cordenadaXP1,
                    cordenadaXP2,cordenadaYP1,cordenadaYP2);
                    cu.imprimir();
            break;
        case 4:
                    System.out.println("Digite la cordenada x del punto 1 :");
                    cordenadaXP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 1 :");
                    cordenadaYP1=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 2 :");
                    cordenadaXP2=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 2 :");
                    cordenadaYP2=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 3 :");
                    cordenadaXP3=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 3 :");
                    cordenadaYP3=lectura.nextDouble();
                    System.out.println("Digite la cordenada x del punto 4 :");
                    cordenadaXP4=lectura.nextDouble();
                    System.out.println("Digite la cordenada y del punto 4 :");
                    cordenadaYP4=lectura.nextDouble(); 
                    Rectangulo r=new Rectangulo(cordenadaXP1,cordenadaYP1,cordenadaXP2,cordenadaYP2,cordenadaXP3,
                    cordenadaYP3,cordenadaXP4,cordenadaYP4);
                    r.imprimir();
               break;
        default:System.out.println("Escoja una opcion valida");    
      } 
     }while(caso==0);
    }
    public MenuGeometrico(){
      seleccion();  
     }
    public static void main(String[] args) {
      MenuGeometrico menu=new MenuGeometrico();
    }
    
    
}