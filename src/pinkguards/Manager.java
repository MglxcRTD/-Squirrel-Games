package pinkguards;

import java.util.ArrayList;
import java.util.List;

public class Manager extends PinkGuard {

	private TipoArma arma;
	private int municion;
	private Prueba prueba_asignada;
	private List<PinkGuard> equipo;

	public Manager(String nombre, int municion, TipoArama arma) {
		super(nombre);
		this.arma = arma;
		this.equipo = new ArrayList<>();

	}

	public void asignarPrueba(Prueba prueba) {
		this.prueba_asignada = prueba;
	}

	public void agregarMiembroEquipo(PinkGuard miembro) {
		equipo.add(miembro);
	}

	public void recargar_municion(int cantidad) {
		this.municion += cantidad;
	}

	@Override
	public String toString() {
		String info = """
				-----------------
				Manager: %s
				Arma: %s
				Municion: %d
				Prueba Asignada: %s
				Supervisor: %s
				Equipo: %d miembros
				""";
		return String.format(info, this.nombre, this.arma, this.municion, this.prueba_asignada, this.supervisor.getNombre(),
				this.equipo.size());
	}

}
