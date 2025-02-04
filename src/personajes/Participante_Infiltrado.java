package personajes;

public class Participante_Infiltrado extends Participante {

	private String nombre_falso;

	public Participante_Infiltrado(String id, String nombre, String apellidos, int anio, int mes, int dia, String sexo,
			String nacionalidad, int monto_a_deber, String nombre_falso) {
		super(id, nombre, apellidos, anio, mes, dia, sexo, nacionalidad, monto_a_deber);
		this.nombre_falso = nombre_falso;
	}

	public String getNombre_falso() {
		return nombre_falso;
	}

	public void setNombre_falso(String nombre_falso) {
		this.nombre_falso = nombre_falso;
	}

}
