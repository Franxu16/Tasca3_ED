import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerify {
    public static PassWord_Result salida(String pssword){
        StringBuilder msgError = new StringBuilder();
        boolean isValid = true;

        if(pssword.length() < 8){
            msgError.append("La contrasenya ha de tenir almenys 8 caràcters\\n");
            isValid = false;
        }
        Pattern Pattern_dig = Pattern.compile("\\d");
        Matcher Mat_Dig = Pattern_dig.matcher(pssword);
        int contadorDigitos = 0;

        while(Mat_Dig.find()){
            contadorDigitos++;
        }
        if(contadorDigitos < 2){
            msgError.append("La contrasenya ha de contenir almenys 2 numeros\n");
            isValid = false;
        }

        Pattern Mayus_pat = Pattern.compile("[A-Z]");
        Matcher Mayus_mat = Mayus_pat.matcher(pssword);
        if(!Mayus_mat.find()){
            msgError.append("La contrasenya ha de contenir almenys una lletra mayuscula\n");
            isValid = false;
        }

        Pattern Espc_pat = Pattern.compile("[^a-zA-Z0-9]");
        Matcher Espc_mat = Espc_pat.matcher(pssword);
        if(!Espc_mat.find()){
            msgError.append("La contrasenya ha de contenir almenys un caracter especial");
            isValid = false;
        }
        return new PassWord_Result(isValid, msgError.toString());
    }
}
