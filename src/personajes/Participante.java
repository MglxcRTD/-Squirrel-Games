package personajes;

import java.time.LocalDate;

public class Participante {
	private String id;
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nacimiento;
	private String sexo;
	private String nacionalidad;
	private int monto_a_deber;

	public Participante(String id, String nombre, String apellidos, LocalDate fecha_nacimiento, String sexo,
			String nacionalidad, int monto_a_deber) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento=fecha_nacimiento;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.monto_a_deber = monto_a_deber;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public int getMonto_a_deber() {
		return monto_a_deber;
	}
	
	

}
