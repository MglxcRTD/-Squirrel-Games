package enumerados;

public enum Armas {
	PISTOLA_GLOCK17("Pistola Glock177"), RIFLE_ASALTO("Rifle de Asalto"), HECKLER_KOCHMP5("Heckler Koch MP5"),
	RIFLE_AUTOMATICO("Rifle Automatico"), HECKLER_KOCHG3("Heckler Koch G3"),
	SMITH_WESSON_MODEL10("Smith & Wesson Model 10");

	private final String arma;

	private Armas(String arma) {
		this.arma=arma;
	}

	public String getArma() {
		return arma;
	}
	
	
}
