/* Nombre: Fran Vidal Chiclana */
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassWordVerify_TEST {
    @Test
    void testValidaContrasenya1(){
        PassWord_Result result = PasswordVerify.salida("");
        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial\n",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya2(){
        PassWord_Result result = PasswordVerify.salida("hola");
        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial\n",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya3(){
        PassWord_Result result = PasswordVerify.salida("holacarcola");
        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial\n",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya4(){
        PassWord_Result result = PasswordVerify.salida("hola12");
        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial\n",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya5(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya5(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya6(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya7(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya8(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya9(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya10(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya11(){
        assertEquals();
    }

    @Test
    void testValidaContrasenya12(){
        assertEquals();
    }
}
