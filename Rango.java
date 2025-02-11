package Trabajo_Entornos;

public enum Rango {

	WORKERS(" Worker ⭘"), SOLDIERS("Soldado △"), MANAGERS(" Manager ☐");

	private final String simbolo;

	private Rango(String simbolo) {
		this.simbolo = simbolo;
		
	}


	public String getSimbolo() {
		return simbolo;
	}
}	
