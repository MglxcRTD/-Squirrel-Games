package enumerados;

/**
 * Enum que representa diferentes tipos de armas utilizadas en el sistema. Cada
 * arma está asociada con su nombre en formato de cadena.
 * 
 * <p>
 * Este enum permite representar las armas de manera más estructurada y segura,
 * proporcionando constantes para cada tipo de arma, evitando el uso de cadenas
 * de texto arbitrarias.
 * </p>
 * 
 * @author [Miguel, Sergio, Daniel y Crisveling]
 * @version 1.0
 * @since 2025
 */
public enum Armas {

	// Definición de las armas disponibles, asociadas a una descripción textual
	PISTOLA_GLOCK17("Pistola Glock17"), RIFLE_ASALTO("Rifle de Asalto"), HECKLER_KOCHMP5("Heckler Koch MP5"),
	RIFLE_AUTOMATICO("Rifle Automático"), HECKLER_KOCHG3("Heckler Koch G3"),
	SMITH_WESSON_MODEL10("Smith & Wesson Model 10");

	// Atributo que almacena la descripción textual del arma
	private final String arma;

	/**
	 * Constructor del enum, que asigna el nombre del arma a la constante.
	 * 
	 * @param arma Nombre del arma, que se mostrará en la representación textual.
	 */
	private Armas(String arma) {
		this.arma = arma;
	}

	/**
	 * Método que devuelve el nombre del arma asociada a la constante.
	 * 
	 * @return El nombre del arma.
	 */
	public String getArma() {
		return arma;
	}
}
