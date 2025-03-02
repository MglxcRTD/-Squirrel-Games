package Main;
import java.time.LocalDate;

import GestionPruebas.EdicionJuegos;
import GestionPruebas.Pruebas;
import personajes.Participante;
import personajes.Participante_Infiltrado;
import pinkguards.Manager;
import pinkguards.PinkGuard;
import pinkguards.Soldiers;
import pinkguards.Workers;
import enumerados.Armas;
import enumerados.Departamentos;
import excepciones.InfiltradoException;
import excepciones.SupervisorException;

public class Principal {
    public static void main(String[] args) {
        // Crear una edición del juego
        EdicionJuegos edicion = new EdicionJuegos(2025, "Isla Misteriosa");
        System.out.println(edicion.toString());
        
        // Crear algunos participantes
        Participante_Infiltrado p1 = new Participante_Infiltrado("P1", "Juan", "Pérez", LocalDate.of(1990, 12, 31), "M", "España", 1000, "NombreFalso");
        Participante p2 = new Participante("P2", "Ana", "Gómez", LocalDate.of(1980, 02, 01), "F", "México", 500);
        Participante p3 = new Participante("P3", "Ana", "Gómez", LocalDate.of(1980, 02, 01), "F", "México", 500);
        
        // Agregar los participantes iniciales a la edición
        edicion.anadirJugadores(p1,p2,p3);
        
        
        //Crear workers
        Workers worker1=new Workers("w1", Departamentos.Preparación_juegos);
        Workers worker2=new Workers("w2", Departamentos.Distribución_alimentos);
        Workers worker3=new Workers("w3", Departamentos.Limpieza_eliminados);
        Workers worker4=new Workers("w4", Departamentos.Limpieza_mantenimiento);
        
        //Crear soldados
        Soldiers soldier1=new Soldiers("s1", Armas.RIFLE_ASALTO, 100);
        Soldiers soldier2=new Soldiers("s2", Armas.HECKLER_KOCHG3, 100);
        Soldiers soldier3=new Soldiers("s3", Armas.HECKLER_KOCHMP5, 100);
         
        
        // Crear un Manager
        Manager supervisor = new Manager("Capitán", 50, Armas.PISTOLA_GLOCK17);
        
        try {
            // Asignar el supervisor a los trabajadores
            worker1.asignarSupervisor(supervisor);
            worker2.asignarSupervisor(supervisor);
            soldier1.asignarSupervisor(supervisor);
            soldier2.asignarSupervisor(supervisor);
        } catch (SupervisorException e) {
           System.err.println(e.getMessage());
        } 
        
        //Añade empleados a la edicion de los juegos y al equipo del supervisor.
        edicion.anadirEmpleados(worker1,worker2,worker3,worker4,soldier1,soldier2,soldier3,supervisor);
        supervisor.agregarMiembroEquipo(worker1,worker2,worker3,worker4,soldier1,soldier2,soldier3);
        
        
        // Crear una prueba
        Pruebas prueba1 = new Pruebas("Luz Roja, Luz Verde", "Los participantes deben detenerse cuando la luz sea roja", supervisor);
        edicion.anadirPrueba(prueba1);
        
        // Inscribir los participantes iniciales en la prueba
        prueba1.inscribirParticipante(p1);
        prueba1.inscribirParticipante(p2);
        prueba1.inscribirParticipante(p3);
        
        // Agregar 456 jugadores adicionales a la prueba
        for (int i = 2; i <= 456; i++) {
            Participante p = new Participante("P" + i, "Jugador" + i, "Apellido" + i, LocalDate.of(1990, 01, 01), "M", "País" + i, 1000);
            edicion.anadirJugador(p);
            prueba1.inscribirParticipante(p);
        }
        
        // Asignar la prueba al Manager
        supervisor.asignarPrueba(prueba1);
        System.out.println(supervisor.toString());
        
        // Iniciar la prueba
        System.out.println(prueba1.toString());
        
        // Mostrar participantes inscritos en la prueba
        System.out.println("Participantes en la prueba: " + prueba1.getParticipantes_inscritos().size());
        
        try {
            prueba1.simularPruebas(0.1);
        } catch (SupervisorException | InfiltradoException e) {
            System.err.println(e.getMessage());
        }
        
        // Finalizar la prueba
        System.out.println("Prueba finalizada.");
    }
}
