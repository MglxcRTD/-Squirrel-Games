package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import GestionPruebas.EdicionJuegos;
import GestionPruebas.Pruebas;
import personajes.Participante;
import pinkguards.PinkGuard;
import pinkguards.Workers;

import java.util.List;
import java.util.Random;

class EdicionJuegosTest {

    private EdicionJuegos edicion;

    @BeforeEach
    void setUp() {
        edicion = new EdicionJuegos(2025, "Isla Desconocida");
    }

    @Test
    void testConstructor() {
        assertEquals(2025, edicion.getAnyoEdicion());
        assertEquals("Isla Desconocida", edicion.getUbicacion());
        assertNotNull(edicion.getParticipantes());
        assertNotNull(edicion.getEmpleados());
        assertNotNull(edicion.getPruebas());
    }

    @Test
    void testAnadirJugador() {
        Participante p1 = new Participante("Jugador1", null, null, null, null, null, 0);
        edicion.anadirJugador(p1);

        List<Participante> participantes = edicion.getParticipantes();
        assertTrue(participantes.contains(p1));
        assertEquals(1, participantes.size());
    }

    @Test
    void testAnadirJugadorNull() {
        edicion.anadirJugador(null);
        List<Participante> participantes = edicion.getParticipantes();
        assertEquals(0, participantes.size());
    }

    @Test
    void testAnadirJugadores() {
        Participante p1 = new Participante("Jugador1", null, null, null, null, null, 0);
        Participante p2 = new Participante("Jugador2", null, null, null, null, null, 0);
        edicion.anadirJugadores(p1, null);

        List<Participante> participantes = edicion.getParticipantes();
        assertTrue(participantes.contains(p1));
        assertFalse(participantes.contains(null));
        assertEquals(1, participantes.size());
    }

    @Test
    void testAnadirJugadorRandom() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String name = "Jugador" + random.nextInt(1000);
            Participante p = new Participante(name, name, name, null, name, name, i);
            edicion.anadirJugador(p);
        }

        assertEquals(100, edicion.getParticipantes().size());
    }

    @Test
    void testAnadirEmpleado() {
        Workers guard = new Workers("Guard1", null);
        edicion.anadirEmpleado(guard);

        List<PinkGuard> empleados = edicion.getEmpleados();
        assertTrue(empleados.contains(guard));
        assertEquals(1, empleados.size());
    }

    @Test
    void testAnadirEmpleadoNull() {
        edicion.anadirEmpleado(null);
        List<PinkGuard> empleados = edicion.getEmpleados();
        assertEquals(0, empleados.size());
    }

    @Test
    void testAnadirEmpleados() {
        Workers guard1 = new Workers("Guard1", null);
        Workers guard2 = new Workers("Guard2", null);
        edicion.anadirEmpleados(guard1, guard2);

        List<PinkGuard> empleados = edicion.getEmpleados();
        assertTrue(empleados.contains(guard1));
        assertTrue(empleados.contains(guard2));
        assertEquals(2, empleados.size());
    }

    @Test
    void testAnadirEmpleadoRandom() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            String name = "Guard" + random.nextInt(1000);
            Workers guard = new Workers(name, null);
            edicion.anadirEmpleado(guard);
        }

        assertEquals(50, edicion.getEmpleados().size());
    }

    @Test
    void testAnadirPrueba() {
        Pruebas prueba = new Pruebas("Prueba1", null, null);
        edicion.anadirPrueba(prueba);

        List<Pruebas> pruebas = edicion.getPruebas();
        assertTrue(pruebas.contains(prueba));
        assertEquals(1, pruebas.size());
    }

    @Test
    void testAnadirPruebaNull() {
        edicion.anadirPrueba(null);
        List<Pruebas> pruebas = edicion.getPruebas();
        assertEquals(0, pruebas.size());
    }

    @Test
    void testAnadirPruebas() {
        Pruebas prueba1 = new Pruebas("Prueba1", null, null);
        Pruebas prueba2 = new Pruebas("Prueba2", null, null);
        edicion.anadirPruebas(prueba1, prueba2);

        List<Pruebas> pruebas = edicion.getPruebas();
        assertTrue(pruebas.contains(prueba1));
        assertTrue(pruebas.contains(prueba2));
        assertEquals(2, pruebas.size());
    }

    @Test
    void testAnadirPruebaRandom() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            String name = "Prueba" + random.nextInt(1000);
            Pruebas prueba = new Pruebas(name, name, null);
            edicion.anadirPrueba(prueba);
        }

        assertEquals(50, edicion.getPruebas().size());
    }

    @Test
    void testToString() {
        String resultado = edicion.toString();
        assertTrue(resultado.contains("2025"));
        assertTrue(resultado.contains("Isla Desconocida"));
        assertTrue(resultado.contains("| SQUIRREL GAMES |"));
    }

    @Test
    void testEdgeCase() {
        EdicionJuegos edicionVacia = new EdicionJuegos(2025, "Desconocida");
        assertEquals(0, edicionVacia.getParticipantes().size());
        assertEquals(0, edicionVacia.getEmpleados().size());
        assertEquals(0, edicionVacia.getPruebas().size());
    }
}
