
public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Bolsa renovada STRANGEEERR");
	}
	@Override
	public void PagarMensalidade() {
		System.out.println("Pagamento da mensalidade com desconto querido $$$");
	}
	
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
