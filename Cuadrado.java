public class Cuadrado implements Figura{
    protected double base;
    protected double altura;

    public Cuadrado(double base, double altura){
        this.base =  base;
        this.altura = altura;
    }

    public double area(){
        return base*altura;
    }

    public double perimetro(){
        return 2*(base + altura);
    }
}
