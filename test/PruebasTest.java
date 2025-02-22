package Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import excepciones.InfiltradoException;
import excepciones.SupervisorException;
import personajes.Participante;
import personajes.Participante_Infiltrado;
import pinkguards.Manager;
import GestionPruebas.Pruebas;

import java.util.List;

class PruebasTest {

    private Pruebas prueba;
    private Manager manager;
    private Participante p1, p2, p3;
    private Participante_Infiltrado infiltrado;

    @BeforeEach
    void setUp() {
        manager = new Manager("Manager1", 0, null);
        prueba = new Pruebas("Prueba de Test", "Descripción de la prueba", manager);
        p1 = new Participante_Infiltrado("p1", null, null, null, null, null, 0, "nombreFalso");
        p2 = new Participante("p2", null, null, null, null, null, 0);
        p3 = new Participante("p3", null, null, null, null, null, 0);
    }

    @Test
    void testConstructor() {
        assertEquals("Prueba de Test", prueba.getNombre());
        assertEquals("Descripción de la prueba", prueba.getDescripcion());
        assertEquals(manager, prueba.getResponsable());
    }

    @Test
    void testInscribirParticipante() {
        prueba.inscribirParticipante(p1);
        List<Participante> inscritos = prueba.getParticipantes_inscritos();
        assertTrue(inscritos.contains(p1));
        assertEquals(1, inscritos.size());
    }

    @Test
    void testInscribirParticipanteYaInscrito() {
        prueba.inscribirParticipante(p1);
        prueba.inscribirParticipante(p1); // Inscribir el mismo participante nuevamente
        List<Participante> inscritos = prueba.getParticipantes_inscritos();
        assertEquals(1, inscritos.size()); // No debe añadirse otra vez.
    }

    @Test
    void testInscribirParticipanteNull() {
        prueba.inscribirParticipante(null);
        List<Participante> inscritos = prueba.getParticipantes_inscritos();
        assertEquals(0, inscritos.size()); // No debe añadirse el null
    }

    @Test
    void testSimularPruebasSinResponsable() {
        prueba.setResponsable(null); // Eliminar el responsable
        assertThrows(SupervisorException.class, () -> {
            prueba.simularPruebas(0.5); // No debe permitir la simulación sin responsable
        });
    }

    @Test
    void testSimularPruebasConInfiltrado() {
        prueba.inscribirParticipante(p1);
        prueba.inscribirParticipante(p2);
        prueba.inscribirParticipante(infiltrado); // Añadir infiltrado
        assertThrows(InfiltradoException.class, () -> {
            prueba.simularPruebas(0.5); // No debe permitir eliminar a un infiltrado
        });
    }

    @Test
    void testSimularPruebasEliminacionCorrectaSinInfiltrados() throws SupervisorException, InfiltradoException {
       
        Participante normal1 = new Participante("Normal1", null, null, null, null, null, 0);
        Participante normal2 = new Participante("Normal2", null, null, null, null, null, 0);
        Participante normal3 = new Participante("Normal3", null, null, null, null, null, 0);
        
        
        prueba.inscribirParticipante(normal1);
        prueba.inscribirParticipante(normal2);
        prueba.inscribirParticipante(normal3);
        
        int cantidadInicial = prueba.getParticipantes_inscritos().size();
        prueba.simularPruebas(0.5);
        
        int eliminadosEsperados = (int) Math.floor(cantidadInicial * 0.5);
        
        
        System.out.println("Inscritos restantes: " + prueba.getParticipantes_inscritos().size());
        System.out.println("Eliminados: " + prueba.getParticipantes_eliminados().size());
        
        assertEquals(eliminadosEsperados, prueba.getParticipantes_eliminados().size(), "El número de eliminados no es el esperado");
        assertEquals(cantidadInicial - eliminadosEsperados, prueba.getParticipantes_inscritos().size(), "El número de inscritos restantes no es el esperado");
    }

    
    @Test
    void testSimularPruebasEliminarMasQueParticipantes() throws SupervisorException, InfiltradoException {
        prueba.inscribirParticipante(p1);
        prueba.inscribirParticipante(p2);
        prueba.inscribirParticipante(p3);

        
        assertThrows(IllegalArgumentException.class, () -> {
            prueba.simularPruebas(2.0); 
        });
    }


    @Test
    void testSimularPruebasConPorcentajeEliminacionIncorrecto() throws SupervisorException {
        prueba.inscribirParticipante(p1);
        prueba.inscribirParticipante(p2);
        assertThrows(IllegalArgumentException.class, () -> {
            prueba.simularPruebas(1.5); 
        });
    }

    @Test
    void testToString() {
        String resultado = prueba.toString();
        assertTrue(resultado.contains("Prueba de Test"));
        assertTrue(resultado.contains("Descripción de la prueba"));
        assertTrue(resultado.contains("Manager1"));
    }
}
