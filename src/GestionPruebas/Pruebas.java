package GestionPruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	
	class ResponsableNoAsignado extends Exception{
		//llamar a la excepcion de jerarquia ----> incluida en clase de guardias
	}
	
	public void simularPruebas(double porcentajeEliminados) throws responsableNoAsignado{
		if(responsable==null) {
			throw new responsableNoAsignado("La prueba debe ser supervisada por un Manager, en caso contrario no iniciará");
		}
		
		int cantidadEliminados=Participantes_inscritos.size() * porcentajeEliminados;
		Collections.shuffle(Participantes_inscritos);
		for(int i=0;i<cantidadEliminados;i++) {
			Participante eliminado=participantes_inscritos.get(i);
			if(eliminado.esInfiltrado) {
				//Llamar a la funcion y lanzar excepcion personalizada ---> inlcuida en clase de personajes
			}
			Participantes_eliminados.add(eliminado);
		}
		participantes_inscritos.removeAll(participantes_eliminados);
	}
}
