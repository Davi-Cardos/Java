
public class Controle implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public  Controle() {
		setvolume(50);
		setligado(false);
		settocando(false);
	}
	
	public int getvolume() {
		return this.volume;
	}
	public boolean getligado() {
		return this.ligado;
	}
	public boolean gettocando() {
		return this.tocando;
	}
	
	public void setvolume(int v) {
		this.volume = v;
	}
	public void setligado(boolean l) {
		this.ligado = l;
	}
	public void settocando(boolean t) {
		this.tocando = t;
	}
	
	public void ligar() {
		if(this.getligado() == true) {
			System.out.printf("Ja esta ligado camarada\n");
		}
		else {
			this.setligado(true);
		}
	}
	
	public void desligar() {
		if(this.getligado() == false) {
			System.out.println("ja esta desligado estrangeiro");
		}
		else {
			this.setligado(false);
		}
		
	}
	public void abrirmenu() {
		if(this.getligado() == true) {
			System.out.println("Volume esta em " +this.getvolume());
			System.out.println("Esta tocando STRANGEER? " +this.gettocando());
		}
		else {
			System.out.println("ERROR ERROR ");
		}
		
	}
	
	public void fecharmenu() {
		System.out.println("Fechando o menu forasteiro");
	}
	public void maisvolume() {
		if(this.getligado() == true) {
			setvolume(this.getvolume()+1);
			System.out.printf("VOLUME +1\n");
		}
	}
	public void menosvolume() {
		if(this.getligado() == true) {
			if(this.getvolume() == 0) {
				System.out.println("0");
			}
			else {
			setvolume(getvolume()-1);
			System.out.printf("VOLUME -1: %d", getvolume());
			}
		}
	}
	public void ligarmudo() {
		
	}
	public void desligarmudo() {
		
	}
	public void play() {
		
	}
	public void pause() {
		
	}
	
	
	
	
}
