public class Trapecio implements Figura{
    protected double base_M;
    protected double base_m;
    protected double altura;
    protected double lado1;
    protected double lado2;

    public Trapecio(double lado1, double lado2, double base_M, double base_m, double altura){
        this.base_M = base_M;
        this.base_m = base_m;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double area(){
        return ((base_M + base_m)/2) * altura;
    }

    public double perimetro(){
        return base_M+base_m+lado1+lado2;
    }
}
