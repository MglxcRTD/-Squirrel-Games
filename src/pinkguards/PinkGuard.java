package pinkguards;

import excepciones.SupervisorException;

public abstract class PinkGuard implements Comparable<PinkGuard> {
	protected String nombre;
	protected PinkGuard supervisor;

	public PinkGuard(String nombre) {
		this.nombre = nombre;
	}

	public abstract int getNivel();

	@Override
	public int compareTo(PinkGuard otro) {
		return Integer.compare(this.getNivel(), otro.getNivel());
	}

	public void asignarSupervisor(PinkGuard supervisor) throws SupervisorException {

		if (supervisor.compareTo(this) <= 0) {
			throw new SupervisorException("No se puede asignar un supervisor de igual o menor rango");
		}

		this.supervisor = supervisor;
	}

	public String getNombre() {
		return nombre;
	}

	public PinkGuard getSupervisor() {
		return supervisor;
	}

}
