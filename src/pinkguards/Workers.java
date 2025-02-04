package pinkguards;

public class Workers extends PinkGuard {
	private Departamento departamento;

	public Workers(String nombre, Departamento departamento) {
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

}
