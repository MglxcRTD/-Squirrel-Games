package pinkguards;

public class Soldiers extends PinkGuard {

	private TipoArma arma;
	private int municion;

	public Soldiers(String nombre, Tipoarma arma, int municion) {
		super(nombre);
		this.arma = arma;
		this.municion = municion;

	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}

	public void recargar_municion(int cantidad) {
		this.municion += cantidad;
	}

	@Override
	public String toString() {
		String info = """
				--------------
				Soldier: %s
				Arma: %s
				Municion: %d
				Supervisor: %s
				""";
		return String.format(info, this.nombre, this.arma, this.municion, this.supervisor.getNombre());
	}

}
