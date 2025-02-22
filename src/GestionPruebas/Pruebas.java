package GestionPruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import excepciones.InfiltradoException;
import excepciones.SupervisorException;
import personajes.Participante;
import personajes.Participante_Infiltrado;
import pinkguards.Manager;

public class Pruebas {
	private String nombre;
	private String descripcion;
	private List<Participante> Participantes_inscritos=new ArrayList<>();
	private List<Participante> Participantes_eliminados=new ArrayList<>();
	private Manager responsable;
	
	public Pruebas(String nombre, String descripcion, Manager responsable) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.responsable=responsable;
	}
	
	//Verifica que no se inscriban participantes nulos
	public void inscribirParticipante(Participante p) {
		if(p!=null && !Participantes_inscritos.contains(p)) {
			Participantes_inscritos.add(p);
		}
	}
	
	
	public void simularPruebas(double porcentajeEliminados) throws SupervisorException, InfiltradoException {
		if(responsable==null) {
			throw new SupervisorException("La prueba debe ser supervisada por un Manager, en caso contrario no iniciará");
		}
		
		//Verifica que el porcentaje de eliminados esté entre 0 y 1 (0 y 100).
		if(porcentajeEliminados <0 || porcentajeEliminados > 1) { 
			throw new IllegalArgumentException("El porcentaje de eliminados debe estar entre 0 y 1");
		}
		
		//Calcular la cantidad de eliminados, al poder sacar resultado decimal, se aproxima al entero más bajo con Math.floor
		int cantidadEliminados=(int) Math.floor((int) (Participantes_inscritos.size() * porcentajeEliminados));
		System.out.println("El porcentaje de eliminados es del "+(porcentajeEliminados*100)+"%");
		
		//Verificar que la cantidad de eliminados no supere el tamaño de eliminados
		if(cantidadEliminados > Participantes_inscritos.size()) {
			cantidadEliminados=Participantes_inscritos.size();
		}
		
		//Randomiza la lista para que las eliminaciones sean aleatorias.
		Collections.shuffle(Participantes_inscritos);
		for(int i=0;i<cantidadEliminados;i++) {
			Participante eliminado=Participantes_inscritos.get(i);
			if(eliminado instanceof Participante_Infiltrado) {
				throw new InfiltradoException("Un participante infiltrado no puede ser eliminado");
			}
			Participantes_eliminados.add(eliminado);
			System.err.println("El jugador: "+eliminado.getId()+" ha sido eliminado");

		}
		
		//Elimina a todos los eliminados de la lista de inscritos
		Participantes_inscritos.removeAll(Participantes_eliminados);
		System.out.println("Quedan "+Participantes_inscritos.size()+" participantes");
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("***************************************\n");
	    sb.append("* PRUEBA: ").append(nombre).append("\n");
	    sb.append("*--------------------------------------\n");
	    sb.append("* DESCRIPCIÓN: ").append(descripcion).append("\n");
	    sb.append("*--------------------------------------\n");
	    sb.append("* RESPONSABLE: ").append(responsable != null ? responsable.getNombre() : "No asignado").append("\n");
	    sb.append("***************************************\n");
	    return sb.toString();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Participante> getParticipantes_inscritos() {
		return Participantes_inscritos;
	}

	public void setParticipantes_inscritos(List<Participante> participantes_inscritos) {
		Participantes_inscritos = participantes_inscritos;
	}

	public List<Participante> getParticipantes_eliminados() {
		return Participantes_eliminados;
	}

	public void setParticipantes_eliminados(List<Participante> participantes_eliminados) {
		Participantes_eliminados = participantes_eliminados;
	}

	public Manager getResponsable() {
		return responsable;
	}

	public void setResponsable(Manager responsable) {
		this.responsable = responsable;
	}
	
}
