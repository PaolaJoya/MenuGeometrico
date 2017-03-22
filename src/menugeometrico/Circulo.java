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
public class Circulo extends Figura {  
    final double PI=3.14156;
    double radio=0.0;
    public Circulo(double cordenadaX, double cordenadaX2, double cordenadaY, double cordenadaY2) {
        super(cordenadaX, cordenadaX2, cordenadaY, cordenadaY2);
    }
    
    @Override
    public double area(){
        double distanciaDeX,distanciaDeY,area; 
        distanciaDeX=super.distanciaDeX(cordenadaX,cordenadaX2);
        distanciaDeY=super.distanciaDeY(cordenadaY,cordenadaY2);
        this.radio=super.magnitudLado(distanciaDeX,distanciaDeY);
        area=Math.abs(PI*radio*radio);
        return area;
    }

    @Override
    public double perimetro(){
        double perimetro;
        perimetro=Math.abs(2*PI*radio);
        return perimetro;
    }  
    public boolean prueba(double area,double perimetro){
        boolean validacion=true;
        area=area();
        perimetro=perimetro();
        if(area==0 || perimetro==0){
            validacion =false;
        }
        return validacion;
    }   
    @Override
    public void imprimir(){
        if( prueba(area(),perimetro())==true){
        super.imprimir();
        System.out.println("Area : "+ area());
        System.out.println("Perimetro : "+ perimetro());
        }else{
            System.out.println("No existe el circulo ");
        }
    }
}