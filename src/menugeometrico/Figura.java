/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menugeometrico;

/**
 *
 * @author David Castro- Paola Joya
 */
public class Figura {
    public double cordenadaX,cordenadaX2,cordenadaY,cordenadaY2;

    public Figura(double cordenadaX, double cordenadaX2, double cordenadaY, double cordenadaY2) {
        this.cordenadaX = cordenadaX;
        this.cordenadaX2 = cordenadaX2;
        this.cordenadaY = cordenadaY;
        this.cordenadaY2 = cordenadaY2;
    }

    public double getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(double cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public double getCordenadaX2() {
        return cordenadaX2;
    }

    public void setCordenadaX2(double cordenadaX2) {
        this.cordenadaX2 = cordenadaX2;
    }

    public double getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(double cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public double getCordenadaY2() {
        return cordenadaY2;
    }

    public void setCordenadaY2(double cordenadaY2) {
        this.cordenadaY2 = cordenadaY2;
    }
    
    public double distanciaDeX(double cordenadaX,double cordenadaX2){
        double distanciaXTotal;
        distanciaXTotal=cordenadaX2-cordenadaX;
        return distanciaXTotal;
    }
    
    public double distanciaDeY(double cordenadaY,double cordenadaY2){
        double distanciaTotalY;
        distanciaTotalY=cordenadaY2 - cordenadaY;
        return distanciaTotalY;
    }
    
    public double magnitudLado(double distanciaTotalX,double distanciaTotalY){
        double tamañoLado;
        tamañoLado= Math.pow(distanciaTotalX,2.0) +Math.pow(distanciaTotalY,2.0);
        tamañoLado=Math.sqrt(tamañoLado);
        return tamañoLado;
    }
    
    public double area(){
        double area=0.0;
        return area;
    }
    
    public double perimetro(){
        double perimetro=0.0;
        return perimetro;
    }
    public void imprimir(){
        System.out.println( "  Resultados ");
    }
}                        
