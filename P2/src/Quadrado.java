
public class Quadrado extends Retangulo{
	private double a, b;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public Quadrado(double a ,double b) {
		super(a, b);
	}
    @Override
    protected double CalcArea() {

        return a * a;
    }

    @Override
    protected double Perimetro() {

        return (a + a) * 2;
    }

}
