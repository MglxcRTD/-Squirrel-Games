package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SupervisorExceptionTest {

    @Test
    void testSupervisorExceptionMessage() {
        String expectedMessage = "Acción no permitida";
        SupervisorException exception = assertThrows(SupervisorException.class, () -> {
            throw new SupervisorException(expectedMessage);
        });
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    void testSupervisorExceptionNullMessage() {
        SupervisorException exception = assertThrows(SupervisorException.class, () -> {
            throw new SupervisorException(null);
        });
        assertNull(exception.getMessage()); 
    }

    @Test
    void testSupervisorExceptionEmptyMessage() {
        String emptyMessage = "";
        SupervisorException exception = assertThrows(SupervisorException.class, () -> {
            throw new SupervisorException(emptyMessage);
        });
        assertEquals(emptyMessage, exception.getMessage()); 
    }

  

    @Test
    void testSupervisorExceptionNullMessageCase() {
        String expectedMessage = null;
        SupervisorException exception = assertThrows(SupervisorException.class, () -> {
            throw new SupervisorException(expectedMessage);
        });
        assertNull(exception.getMessage()); 
    }

    @Test
    void testSupervisorExceptionEmptyMessageCase() {
        String emptyMessage = "";
        SupervisorException exception = assertThrows(SupervisorException.class, () -> {
            throw new SupervisorException(emptyMessage);
        });
        assertEquals(emptyMessage, exception.getMessage()); 
    }

 
    @Test
    void testSerialVersionUID() {
    
        assertEquals(1L, SupervisorException.serialVersionUID);
    }
}
