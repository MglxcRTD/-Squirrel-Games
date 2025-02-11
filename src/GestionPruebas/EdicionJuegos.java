package entornos;

import java.util.ArrayList;
import java.util.List;

public class EdicionJuegos {

	protected int anyoEdicion;
	protected String ubicacion;
	protected List<Participante> participantes;
	protected List<PinkGuard> empleados;
	protected List<Prueba> pruebas;

	public EdicionJuegos(int anyo, String ubicacion) {
		this.anyoEdicion = anyo;
		this.ubicacion = ubicacion;
		this.participantes = new ArrayList<Participante>(456);
		this.empleados = new ArrayList<PinkGuard>();
		this.pruebas = new ArrayList<Prueba>();
	}

	public void anadirJugador(Participante p) {
		if (p != null) {
			this.participantes.add(p);
		}
	}

	public void anadirJugadores(Participante... p) {
		for (Participante pa : p) {
			this.anadirJugador(pa);
		}
	}

	public void anadirEmpleado(PinkGuard p) {
		if (p != null) {
			this.empleados.add(p);
		}
	}

	public void anadirEmpleados(PinkGuard... p) {
		for (PinkGuard pi : p) {
			this.anadirEmpleado(pi);
		}
	}

	public void anadirPrueba(Prueba p) {
		if (p != null) {
			this.pruebas.add(p);
		}
	}

	public void anadirPruebas(Prueba... p) {
		for (Prueba pa : p) {
			this.anadirPrueba(pa);
		}
	}

	@Override
	public String toString() {
		String i = String.format("""
				   | SQUIRREL GAMES |
				Edicion   ---   Ubicacion
				  %d           %s
				""", this.anyoEdicion, this.ubicacion);

		return i;
	}

	public int getAnyoEdicion() {
		return anyoEdicion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public List<PinkGuard> getEmpleados() {
		return empleados;
	}

	public List<Prueba> getPruebas() {
		return pruebas;
	}
	
}
