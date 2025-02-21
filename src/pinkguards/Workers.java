package pinkguards;

import enumerados.Departamentos;

public class Workers extends PinkGuard {
	private Departamentos departamento;

	public Workers(String nombre, Departamentos departamento) {
		super(nombre);
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		String info = """
				---------------
				Worker: %s
				Departamento: %s
				Supervisor: %s
				""";
		return String.format(info, this.nombre, this.departamento, this.supervisor.getNombre());
	}

	@Override
	public int getNivel() {
		return 1;
	}

}
