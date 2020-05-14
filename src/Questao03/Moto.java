package Questao03;

public class Moto {

	private String marca;
	private String modelo;
	private String cor;
	private int marcha = 1;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public void imprimirMoto() {
		System.out.println("Marca: Honda;");
		System.out.println("Modelo: CG 160 Titan S;");
		System.out.println("Cor: Vermelha.");
		
	}
	
	public void posicaoMarcha(int marcha) {
		
		if (marcha == 0) {
			System.out.println("Neutro");
		} else if (marcha == 1) {
			System.out.println("Primeira");
		} else if (marcha == 2) {
			System.out.println("Segunda");
		} else if (marcha == 3) {
			System.out.println("Terceira");
		} else if (marcha == 4) {
			System.out.println("Quarta");
		} else if (marcha == 5) {
			System.out.println("Quinta");
		} else if(marcha < 0 ||  marcha > 5){
			System.out.println("Marcha invalida");
		}else {
			
		}
		
	}
	

}
