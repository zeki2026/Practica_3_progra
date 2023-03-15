public class T_equilatero implements Figura{
    protected double base;
    protected double altura;
    protected double lado;

    public T_equilatero(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double area(){
        return (base*altura)/2;
    }
    public double perimetro(){
        return (2*lado)+base;
    }
}
