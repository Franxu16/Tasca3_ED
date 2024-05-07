import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerify {
    public static PassWord_Result salida(String pssword){
        StringBuilder msgError = new StringBuilder();
        boolean isValid = true;

        if(pssword.length() < 8){
            isValid = false;
            msgError.append(isValid).append("La contrasenya ha de tenir almenys 8 caracters").append("\n");
        }
        Pattern Pattern_dig = Pattern.compile("\\d");
        Matcher Mat_Dig = Pattern_dig.matcher(pssword);
        int contadorDigitos = 0;

        while(Mat_Dig.find()){
            contadorDigitos++;
        }
        if(contadorDigitos < 2){
            isValid = false;
            msgError.append(isValid).append("La contrasenya ha de contenir almenys 2 numeros").append("\n");
        }

        Pattern Mayus_pat = Pattern.compile("[A-Z]");
        Matcher Mayus_mat = Mayus_pat.matcher(pssword);
        if(!Mayus_mat.find()){
            isValid = false;
            msgError.append("La contrasenya ha de contenir almenys una lletra majuscula").append("\n");
        }

        Pattern Espc_pat = Pattern.compile("[^a-zA-Z0-9]");
        Matcher Espc_mat = Espc_pat.matcher(pssword);
        if(!Espc_mat.find()){
            isValid = false;
            msgError.append("La contrasenya ha de contenir almenys un caracter especial");
        }
        return new PassWord_Result(isValid, msgError.toString());
    }
}
