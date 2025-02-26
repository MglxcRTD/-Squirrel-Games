package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InfiltradoExceptionTest {

    

    @Test
    void testInfiltradoExceptionMessage() {
        String expectedMessage = "Acceso no autorizado";
        InfiltradoException exception = assertThrows(InfiltradoException.class, () -> {
            throw new InfiltradoException(expectedMessage);
        });
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    void testInfiltradoExceptionNoMessage() {
        InfiltradoException exception = assertThrows(InfiltradoException.class, () -> {
            throw new InfiltradoException(null);
        });
        assertNull(exception.getMessage());
    }

    @Test
    void testInfiltradoExceptionEmptyMessage() {
        String emptyMessage = "";
        InfiltradoException exception = assertThrows(InfiltradoException.class, () -> {
            throw new InfiltradoException(emptyMessage);
        });
        assertEquals(emptyMessage, exception.getMessage());
    }


    @Test
    void testInfiltradoExceptionNullMessage() {
        String expectedMessage = null;
        InfiltradoException exception = assertThrows(InfiltradoException.class, () -> {
            throw new InfiltradoException(expectedMessage);
        });
        assertNull(exception.getMessage());
    }

    
    @Test
    void testSerialVersionUID() {
       
        assertEquals(2L, InfiltradoException.serialVersionUID);
    }
}
