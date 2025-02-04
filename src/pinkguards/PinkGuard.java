package pinkguards;

public abstract class PinkGuard {
	protected String nombre;
	protected PinkGuard supervisor;

	public PinkGuard(String nombre) {
		this.nombre = nombre;
	}

	public void asignarSupervisor(PinkGuard supervisor) throws SupervisorException {
		if (supervisor.getClass().equals(this.getClass()) || supervisor.getClass().isAssignableFrom(this.getClass())) {
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
