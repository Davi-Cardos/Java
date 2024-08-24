
public class Caneta {
protected String cor;
protected String modelo;
protected float ponta;
protected int carga;
protected boolean tampada;

public Caneta(String c, String m, float p, int ca, boolean t) {
	this.cor = c;
	this.setmodelo(m);
	this.ponta = p;
	this.carga = ca;
	this.tampar();
}

public void rabiscar() {
	if (this.tampada == true) {
		System.out.println("Não eh possivel rabiscar\n");
	}
	else {
		System.out.println("Estou rabiscando\n");
	}
}

public String getcor() {
	return this.cor;
}
public void setcor(String c) {
	this.cor = c;
}
public String getmodelo() {
	return this.modelo;
}
public void setmodelo(String m) {
	this.modelo = m;
}
public float getponta() {
	return this.ponta;
}
public void setponta(float p) {
	this.ponta = p;
}
public int getcarga() {
	return this.carga;
}
public void setcarga(int ca) {
	this.carga = ca;
}
public boolean gettampada() {
	return this.tampada;
}
public void settampada(boolean t) {
	tampada = t;
}
public void tampar() {
	if(this.tampada == true) {
		System.out.println("Ja esta tampada\n");
	}
	else {
		this.tampada = true;
		System.out.println("agr esta tampada\n");
	}
}

public void destampar() {
	if(this.tampada == true) {
		this.tampada = false;
		System.out.println("agr esta destampada\n");
	}
	else {
		System.out.println("Ela ja esta destampada meu nobre\n");
	}
}
public void status() {
	System.out.println("Modelo: " +this.getmodelo());
	System.out.println("Cor: " +this.getcor());
	System.out.println("Ponta " +this.getmodelo());
	System.out.println("Carga " +this.getcarga());
	System.out.println("Tampada" +this.gettampada());
	
	
}
}

