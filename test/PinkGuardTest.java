package entornos;

import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

class PinkGuardConcreto extends PinkGuard {
    public PinkGuardConcreto(String nombre) {
        super(nombre);
    }
}

class PinkGuardTest {

	@Test
	void testConstructor() {
		PinkGuard guard = new PinkGuardConcreto("Guardia1");
		assertEquals("Guardia1", guard.getNombre());
		assertNull(guard.getSupervisor());
	}

	@Test
	void testAsignarSupervisorValido() throws SupervisorException {
		PinkGuard guard = new PinkGuardConcreto("Guardia1");
		PinkGuard supervisor = new PinkGuardConcreto("Supervisor1") {
		};

		guard.asignarSupervisor(supervisor);
		assertEquals(supervisor, guard.getSupervisor());
	}

	@Test
	void testAsignarSupervisorInvalidoMismoRango() {
		PinkGuard guard = new PinkGuardConcreto("Guardia1");
		PinkGuard supervisor = new PinkGuardConcreto("Supervisor1");

		assertThrows(SupervisorException.class, () -> {
			guard.asignarSupervisor(supervisor);
		});
	}

	@Test
	void testAsignarSupervisorInvalidoMenorRango() {
		PinkGuard guard = new PinkGuardConcreto("Guardia1");
		PinkGuard supervisor = new PinkGuardConcreto("Supervisor1") {
		};

		assertThrows(SupervisorException.class, () -> {
			guard.asignarSupervisor(supervisor);
		});
	}

	@Test
	void testAsignarSupervisorNulo() throws SupervisorException {
		PinkGuard guard = new PinkGuardConcreto("Guardia1");
		guard.asignarSupervisor(null);
		assertNull(guard.getSupervisor());
	}

	@Test
	void testGetNombre() {
		PinkGuard guard = new PinkGuardConcreto("Guardia1");
		assertEquals("Guardia1", guard.getNombre());
	}

	@Test
	void testGetSupervisor() throws SupervisorException {
		PinkGuard guard = new PinkGuardConcreto("Guardia1");
		PinkGuard supervisor = new PinkGuardConcreto("Supervisor1") {
		};

		guard.asignarSupervisor(supervisor);
		assertEquals(supervisor, guard.getSupervisor());
	}
}