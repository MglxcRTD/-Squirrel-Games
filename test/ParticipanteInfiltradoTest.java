package entornos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ParticipanteInfiltradoTest {

		    @Test
		    void testConstructor() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, "FalsoNombre");

		        assertEquals("123", infiltrado.getId());
		        assertEquals("Juan", infiltrado.getNombre());
		        assertEquals("Perez", infiltrado.getApellidos());
		        assertEquals(LocalDate.of(1990, 5, 15), infiltrado.getFecha_nacimiento());
		        assertEquals("Masculino", infiltrado.getSexo());
		        assertEquals("Mexicana", infiltrado.getNacionalidad());
		        assertEquals(1000, infiltrado.getMonto_a_deber());
		        assertEquals("FalsoNombre", infiltrado.getNombre_falso());
		    }

		    @Test
		    void testGetNombreFalso() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, "FalsoNombre");

		        assertEquals("FalsoNombre", infiltrado.getNombre_falso());
		    }

		    @Test
		    void testSetNombreFalso() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, "FalsoNombre");

		        infiltrado.setNombre_falso("NuevoFalsoNombre");
		        assertEquals("NuevoFalsoNombre", infiltrado.getNombre_falso());
		    }

		    @Test
		    void testSetNombreFalsoNull() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, "FalsoNombre");

		        infiltrado.setNombre_falso(null);
		        assertNull(infiltrado.getNombre_falso());
		    }

		    @Test
		    void testSetNombreFalsoVacio() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, "FalsoNombre");

		        infiltrado.setNombre_falso("");
		        assertEquals("", infiltrado.getNombre_falso());
		    }

		    @Test
		    void testToString() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, "FalsoNombre");

		        String expected = """
		                Nombre: Juan Perez
		                ID: 123
		                """;
		        assertEquals(expected, infiltrado.toString());
		    }

		    @Test
		    void testConstructorConNombreFalsoNull() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, null);

		        assertNull(infiltrado.getNombre_falso());
		    }

		    @Test
		    void testConstructorConNombreFalsoVacio() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", 1000, "");

		        assertEquals("", infiltrado.getNombre_falso());
		    }

		    @Test
		    void testFechaNacimientoInvalida() {
		        assertThrows(IllegalArgumentException.class, () -> {
		            new Participante_Infiltrado("123", "Juan", "Perez", 32, 13, 1990, "Masculino", "Mexicana", 1000, "FalsoNombre");
		        });
		    }

		    @Test
		    void testMontoNegativo() {
		        Participante_Infiltrado infiltrado = new Participante_Infiltrado("123", "Juan", "Perez", 15, 5, 1990, "Masculino", "Mexicana", -100, "FalsoNombre");
		        assertEquals(-100, infiltrado.getMonto_a_deber());
		    }
		}