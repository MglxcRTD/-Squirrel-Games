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
	
	
	public void simularPruebas(double porcentajeEliminados) throws SupervisorException, InfiltradoException {
		if(responsable==null) {
			throw new SupervisorException("La prueba debe ser supervisada por un Manager, en caso contrario no iniciará");
		}
		
		double cantidadEliminados=Participantes_inscritos.size() * porcentajeEliminados;
		Collections.shuffle(Participantes_inscritos);
		for(int i=0;i<cantidadEliminados;i++) {
			Participante eliminado=Participantes_inscritos.get(i);
			if(eliminado instanceof Participante_Infiltrado) {
				throw new InfiltradoException("Un participante infiltrado no puede ser eliminado");
			}
			Participantes_eliminados.add(eliminado);
		}
		Participantes_inscritos.removeAll(Participantes_eliminados);
	}
}
