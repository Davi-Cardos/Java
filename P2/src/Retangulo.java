
public class Retangulo extends Forma{
	private double largura;
	private double comprimento;
	
	public Retangulo(double comprimento, double largura){
		this.comprimento = comprimento;
		this.largura = largura;
	}
	@Override
	protected double CalcArea() {
		
		return largura * comprimento;
	}
	@Override
	protected double Perimetro() {
		double soma = largura + comprimento;
		return soma * 2;
	}
	@Override
	protected void Imprimir() {
		System.out.println("Area eh " +CalcArea() + "Perimetro eh " +Perimetro());
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
}
