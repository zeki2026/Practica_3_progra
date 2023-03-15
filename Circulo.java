public class Circulo implements Figura{
    protected double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double area(){
        return (2*Math.PI) * radio;
    }

    public double perimetro(){
        return Math.pow((Math.PI * radio), 2);
    }
}
