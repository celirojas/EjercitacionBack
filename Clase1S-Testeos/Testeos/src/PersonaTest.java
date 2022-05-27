
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    @Test
    void esMayor(){
        Persona persona = new Persona("Celina", "Rojas", "celina@mail.com", 31);
        assertEquals(true, persona.esMayor());

    }

}