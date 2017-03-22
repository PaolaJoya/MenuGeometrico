/*
 *  To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menugeometrico;
/**
 *
 * @author David Castro-Paola Joya
 */

public class Triangulo extends Figura {
    double cordenadaX3,cordenadaY3,lado1,lado2,lado3;

    public Triangulo(double cordenadaX3, double cordenadaY3, double cordenadaX, double cordenadaX2, double cordenadaY, double cordenadaY2) {
        super(cordenadaX, cordenadaX2, cordenadaY, cordenadaY2);
        this.cordenadaX3 = cordenadaX3;
        this.cordenadaY3 = cordenadaY3;
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
     
     @Override
    public double area(){
        double distanciax1,distanciax2,distanciay1,distanciay2;
        double ayudaArea,area;
        distanciax1=super.distanciaDeX(cordenadaX,cordenadaX2);
        distanciax2=super.distanciaDeY(cordenadaX2,cordenadaX3);
        distanciay1=super.distanciaDeX(cordenadaY,cordenadaY2);
        distanciay2=super.distanciaDeY(cordenadaY2,cordenadaY3);
        ayudaArea=(distanciax1*distanciay2)-(distanciax2*distanciay1);
        area=Math.abs(ayudaArea)/2;
        return area;
    }
     @Override
    public double perimetro(){
        double distanciax1,distanciax2,distanciax3,distanciay1,distanciay2,distanciay3;
        double perimetro;
        distanciax1=super.distanciaDeX(cordenadaX,cordenadaX2);
        distanciax2=super.distanciaDeY(cordenadaX2,cordenadaX3);
        distanciay1=super.distanciaDeX(cordenadaY,cordenadaY2);
        distanciay2=super.distanciaDeY(cordenadaY2,cordenadaY3);
        distanciax3=super.distanciaDeX(cordenadaX, cordenadaX3);
        distanciay3=super.distanciaDeY(cordenadaY, cordenadaY3);
        this.lado1=super.magnitudLado(distanciax1, distanciay1);
        this.lado2=super.magnitudLado(distanciax2, distanciay2);
        this.lado3=super.magnitudLado(distanciax3, distanciay3);
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }
   private void tipoTriangulo(){
        if((lado1==lado2) && (lado2==lado3)){
        System.out.println("El triangulo es Equilatero");
      }else 
        if((lado1==lado2)||(lado1==lado3)||(lado2==lado3)){
        System.out.println("El triangulo es Isoceles");
      }else 
        System.out.println("El triangulo es : Escaleno ");
  }
  private boolean validacion(){
        return (((cordenadaX!=cordenadaX2)||(cordenadaY!=cordenadaY2))&&((cordenadaX2!=cordenadaX3)||
                (cordenadaY2!=cordenadaY3))&&((cordenadaX!=cordenadaX3)||(cordenadaY!=cordenadaY3)))&&
                (((cordenadaX!=cordenadaX2)||(cordenadaX!=cordenadaX3)||(cordenadaX2!=cordenadaX3)));
  }
    @Override
  public void imprimir(){
      super.imprimir();
      if(validacion()==true){
          tipoTriangulo();
          System.out.println("El perimetro es:"+perimetro());
          System.out.println("El area es : "+area());
      }else
            System.out.println("El triangulo no existe ");
    
  }
}