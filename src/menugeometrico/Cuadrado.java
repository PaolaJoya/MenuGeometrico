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

public class Cuadrado extends Figura {
    double cordenadaX3,cordenadaY3,cordenadaX4,cordenadaY4,lado1,lado2,lado3,lado4;

    public Cuadrado(double cordenadaX3, double cordenadaY3, double cordenadaX4, double cordenadaY4, double cordenadaX, double cordenadaX2, double cordenadaY, double cordenadaY2) {
        super(cordenadaX, cordenadaX2, cordenadaY, cordenadaY2);
        this.cordenadaX3 = cordenadaX3;
        this.cordenadaY3 = cordenadaY3;
        this.cordenadaX4 = cordenadaX4;
        this.cordenadaY4 = cordenadaY4;
    }

    public double getCordenadaX3() {
        return cordenadaX3;
    }

    public void setCordenadaX3(double cordenadaX3) {
        this.cordenadaX3 = cordenadaX3;
    }

    public double getCordenadaY3() {
        return cordenadaY3;
    }

    public void setCordenadaY3(double cordenadaY3) {
        this.cordenadaY3 = cordenadaY3;
    }

    public double getCordenadaX4() {
        return cordenadaX4;
    }

    public void setCordenadaX4(double cordenadaX4) {
        this.cordenadaX4 = cordenadaX4;
    }

    public double getCordenadaY4() {
        return cordenadaY4;
    }

    public void setCordenadaY4(double cordenadaY4) {
        this.cordenadaY4 = cordenadaY4;
    }
    
    @Override
    public double area(){
        double distanciax,distanciay,area;
        distanciax=super.distanciaDeX(cordenadaX, cordenadaX2);
        distanciay=super.distanciaDeY(cordenadaY, cordenadaY2);
        this.lado1=super.magnitudLado(distanciax, distanciay);
        area=lado1 * lado1;
        return area;
    }
    
    @Override
    public double perimetro(){
        return lado1*4;
    }
     public boolean validacionLado(){
         double distanciax2,distanciax3,distanciax4,distanciay2,distanciay3,distanciay4;
         distanciax2=super.distanciaDeX(cordenadaX2, cordenadaX3);
         distanciay2=super.distanciaDeY(cordenadaY2, cordenadaY3);
         this.lado2=super.magnitudLado(distanciax2, distanciay2);
         distanciax3=super.distanciaDeX(cordenadaX3, cordenadaX4);
         distanciay3=super.distanciaDeY(cordenadaY3, cordenadaY4);
         this.lado3=super.magnitudLado(distanciax3, distanciay3);
         distanciax4=super.distanciaDeX(cordenadaX4, cordenadaX);
         distanciay4=super.distanciaDeY(cordenadaY4, cordenadaY);
         this.lado4=super.magnitudLado(distanciax4, distanciay4);
         System.out.println(lado1);
         if(lado1==lado2 && lado2==lado3 && lado3==lado4){
           return false;
         }else
         return true; 
     }
     
    @Override
     public void imprimir(){
         super.imprimir();
         if(validacionLado()==true){
             System.out.println("El area es : "+area());
             System.out.println("El perimetro es: "+perimetro());
             System.out.println("Magnitud de los lados : "+lado1);
         }else
             System.out.println("No existe el cuadrado");
     }
     
}                        
