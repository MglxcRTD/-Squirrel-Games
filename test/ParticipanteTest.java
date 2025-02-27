package entornos;

import static org.junit.jupiter.api.Assertions.*;

	import java.time.LocalDate;

	import org.junit.jupiter.api.Test;

	public class ParticipanteTest {
		    @Test
		    void testConstructorCompleto() {
		        Participante participante = new Participante("123", "Juan", "Perez", 1990, 5, 15, "Masculino", "Mexicana", 1000);
		        
		        assertEquals("123", participante.getId());
		        assertEquals("Juan", participante.getNombre());
		        assertEquals("Perez", participante.getApellidos());
		        assertEquals(LocalDate.of(1990, 5, 15), participante.getFecha_nacimiento());
		        assertEquals("Masculino", participante.getSexo());
		        assertEquals("Mexicana", participante.getNacionalidad());
		        assertEquals(1000, participante.getMonto_a_deber());
		    }

		    @Test
		    void testConstructorBasico() {
		        Participante participante = new Participante("456", "Ana", "Gomez");
		        
		        assertEquals("456", participante.getId());
		        assertEquals("Ana", participante.getNombre());
		        assertEquals("Gomez", participante.getApellidos());
		        assertNull(participante.getFecha_nacimiento());
		        assertNull(participante.getSexo());
		        assertNull(participante.getNacionalidad());
		        assertEquals(0, participante.getMonto_a_deber());
		    }

		    @Test
		    void testToString() {
		        Participante participante = new Participante("789", "Carlos", "Lopez");
		        String expected = """
		                Nombre: Carlos Lopez
		                ID: 789
		                """;
		        
		        assertEquals(expected, participante.toString());
		    }

		    @Test
		    void testFechaNacimientoLimite() {
		        Participante participante = new Participante("001", "Maria", "Garcia", 1900, 1, 1, "Femenino", "Española", 500);
		        assertEquals(LocalDate.of(1900, 1, 1), participante.getFecha_nacimiento());

		        LocalDate hoy = LocalDate.now();
		        Participante participante2 = new Participante("002", "Luis", "Martinez", hoy.getYear(), hoy.getMonthValue(), hoy.getDayOfMonth(), "Masculino", "Argentina", 200);
		        assertEquals(hoy, participante2.getFecha_nacimiento());
		    }

		    @Test
		    void testMontoNegativo() {
		        Participante participante = new Participante("003", "Pedro", "Sanchez", 1985, 7, 20, "Masculino", "Chilena", -100);
		        assertEquals(-100, participante.getMonto_a_deber());
		    }

		    @Test
		    void testNacionalidadNull() {
		        Participante participante = new Participante("004", "Laura", "Fernandez", 1995, 8, 25, "Femenino", null, 300);
		        assertNull(participante.getNacionalidad());
		    }

		    @Test
		    void testSexoInvalido() {
		        Participante participante = new Participante("005", "Roberto", "Gomez", 1975, 9, 30, "Otro", "Colombiana", 400);
		        assertEquals("Otro", participante.getSexo());
		    }
		}