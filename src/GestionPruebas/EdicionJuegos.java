package GestionPruebas;

/**
 * Importación de la clase {@link personajes.Participante} desde el paquete {@link personajes}.
 * {@link Participante} representa a un jugador que participa en la edición de los juegos.
 */
import personajes.Participante;

/**
 * Importación de la clase {@link pinkguards.PinkGuard} desde el paquete {@link pinkguards}.
 * {@link PinkGuard} representa a un miembro del personal encargado de la organización de los juegos, como un worker o supervisor.
 */
import pinkguards.PinkGuard;

/**
 * Importación de la clase {@link java.util.ArrayList} desde el paquete {@link java.util}.
 * {@link ArrayList} es una implementación de la interfaz {@link List} que se utiliza para almacenar elementos en una lista dinámica.
 */
import java.util.ArrayList;

/**
 * Importación de la clase {@link java.util.List} desde el paquete {@link java.util}.
 * {@link List} es una interfaz que define el comportamiento de una colección de elementos ordenados, que permite el acceso a los elementos por su índice.
 */
import java.util.List;

/**
 * Representa una edición de los Squirrel Games.
 * 
 * <p>
 * La clase gestiona todos los aspectos de una edición específica de los juegos,
 * incluidos los participantes, los empleados (Pink Guards), y las pruebas
 * asignadas a la edición.
 * </p>
 * 
 * <p>
 * Se permite añadir jugadores, empleados y pruebas a la edición, así como
 * acceder a detalles sobre la edición como su año y ubicación.
 * </p>
 * 
 * @author [Miguel, Sergio, Daniel y Crisveling]
 * @version 1.0
 * @since 2025
 * @see Participante
 * @see PinkGuard
 * @see Pruebas
 */
public class EdicionJuegos {

	/** Año en el que se realiza la edición de los juegos. */
	protected int anyoEdicion;

	/** Ubicación donde se celebran los juegos de la edición. */
	protected String ubicacion;

	/** Lista de participantes en esta edición de los juegos. */
	protected List<Participante> participantes;

	/**
	 * Lista de empleados (Pink Guards) encargados de supervisar y organizar los
	 * juegos.
	 */
	protected List<PinkGuard> empleados;

	/** Lista de pruebas que se realizan en la edición de los juegos. */
	protected List<Pruebas> pruebas;

	/**
	 * Constructor que inicializa una nueva edición de los juegos con el año y la
	 * ubicación proporcionados.
	 * 
	 * @param anyo      Año de la edición de los juegos.
	 * @param ubicacion Ubicación de la edición de los juegos.
	 */
	public EdicionJuegos(int anyo, String ubicacion) {
		this.anyoEdicion = anyo;
		this.ubicacion = ubicacion;
		this.participantes = new ArrayList<Participante>(456); // Inicializa la lista con capacidad inicial de 456.
		this.empleados = new ArrayList<PinkGuard>(); // Lista para empleados (Pink Guards).
		this.pruebas = new ArrayList<Pruebas>(); // Lista para las pruebas.
	}

	/**
	 * Añade un jugador a la lista de participantes de la edición de los juegos.
	 * 
	 * @param p Jugador a añadir a la lista.
	 */
	public void anadirJugador(Participante p) {
		if (p != null) {
			this.participantes.add(p);
		}
	}

	/**
	 * Añade múltiples jugadores a la lista de participantes.
	 * 
	 * @param p Jugadores a añadir.
	 */
	public void anadirJugadores(Participante... p) {
		for (Participante pa : p) {
			if (pa != null) {
				this.anadirJugador(pa);
			}
		}
	}

	/**
	 * Añade un empleado (Pink Guard) a la lista de empleados de la edición.
	 * 
	 * @param p Empleado (Pink Guard) a añadir.
	 */
	public void anadirEmpleado(PinkGuard p) {
		if (p != null) {
			this.empleados.add(p);
		}
	}

	/**
	 * Añade múltiples empleados (Pink Guards) a la lista de empleados.
	 * 
	 * @param p Empleados (Pink Guards) a añadir.
	 */
	public void anadirEmpleados(PinkGuard... p) {
		for (PinkGuard pi : p) {
			this.anadirEmpleado(pi);
		}
	}

	/**
	 * Añade una prueba a la lista de pruebas de la edición de los juegos.
	 * 
	 * @param p Prueba a añadir.
	 */
	public void anadirPrueba(Pruebas p) {
		if (p != null) {
			this.pruebas.add(p);
		}
	}

	/**
	 * Añade múltiples pruebas a la lista de pruebas de la edición.
	 * 
	 * @param p Pruebas a añadir.
	 */
	public void anadirPruebas(Pruebas... p) {
		for (Pruebas pa : p) {
			this.anadirPrueba(pa);
		}
	}

	/**
	 * Devuelve una representación en forma de cadena de la edición de los juegos,
	 * mostrando el año y la ubicación.
	 * 
	 * @return Una cadena que describe la edición de los juegos.
	 */
	@Override
	public String toString() {
		String i = String.format("""
				   | SQUIRREL GAMES |
				Edicion   ---   Ubicacion
				  %d           %s
				""", this.anyoEdicion, this.ubicacion);

		return i;
	}

	/**
	 * Obtiene el año de la edición de los juegos.
	 * 
	 * @return Año de la edición.
	 */
	public int getAnyoEdicion() {
		return anyoEdicion;
	}

	/**
	 * Obtiene la ubicación donde se celebra la edición de los juegos.
	 * 
	 * @return Ubicación de la edición de los juegos.
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * Obtiene la lista de participantes en la edición de los juegos.
	 * 
	 * @return Lista de los participantes.
	 */
	public List<Participante> getParticipantes() {
		return participantes;
	}

	/**
	 * Obtiene la lista de empleados (Pink Guards) asignados a la edición de los
	 * juegos.
	 * 
	 * @return Lista de empleados.
	 */
	public List<PinkGuard> getEmpleados() {
		return empleados;
	}

	/**
	 * Obtiene la lista de las pruebas de la edición de los juegos.
	 * 
	 * @return Lista de las pruebas.
	 */
	public List<Pruebas> getPruebas() {
		return pruebas;
	}

}
