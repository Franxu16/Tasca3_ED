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
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys 2 numeros
                        La contrasenya ha de contenir almenys una lletra majuscula
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya2(){
        PassWord_Result result = PasswordVerify.salida("hola");
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys 2 numeros
                        La contrasenya ha de contenir almenys una lletra majuscula
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya3(){
        PassWord_Result result = PasswordVerify.salida("holacarcola");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de contenir almenys 2 numeros
                        La contrasenya ha de contenir almenys una lletra majuscula
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya4(){
        PassWord_Result result = PasswordVerify.salida("hola12");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys una lletra majuscula
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya5(){
        PassWord_Result result = PasswordVerify.salida("holA");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys 2 numeros
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage()
                );
    }

    @Test
    void testValidaContrasenya6(){
        PassWord_Result result = PasswordVerify.salida("hola!");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys 2 numeros
                        La contrasenya ha de contenir almenys una lletra majuscula""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya7(){
        PassWord_Result result = PasswordVerify.salida("holaA!");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys 2 numeros
                        """,
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya8(){
        PassWord_Result result = PasswordVerify.salida("hola12!");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys una lletra majuscula
                        """,
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya9(){
        PassWord_Result result = PasswordVerify.salida("hola12A");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de tenir almenys 8 caracters
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya10(){
        PassWord_Result result = PasswordVerify.salida("holacaracola12");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de contenir almenys una lletra majuscula
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya11(){
        PassWord_Result result = PasswordVerify.salida("holacaracola!");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de contenir almenys 2 numeros
                        La contrasenya ha de contenir almenys una lletra majuscula
                        """,
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya12(){
        PassWord_Result result = PasswordVerify.salida("holacaracolA");
        assertFalse(result.isValid());
        assertEquals(false + """
                        La contrasenya ha de contenir almenys 2 numeros
                        La contrasenya ha de contenir almenys un caracter especial""",
                result.getErrorMessage());
    }

    @Test
    void testValidaContrasenya13(){
        PassWord_Result result = PasswordVerify.salida("ho12A!");
        assertEquals(false + """
                La contrasenya ha de tenir almenys 8 caracters
                """,
                result.getErrorMessage());
    }
}
