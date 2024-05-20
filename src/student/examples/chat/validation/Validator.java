package student.examples.chat.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public Validator(){}
    //rules for String
    public boolean isString(Object value){                      // method which is validate the String
        if ((value.getClass().getName().equals("java.lang.String"))){
            return true;
        }
        return false;
    }
    public boolean isNotNull(Object value){
        return value != null;
    }
    public boolean isEmpty(Object value){
       // if (isString(value)){
            return ((String) value).isEmpty();
        }
       // return false;
    public boolean isValid(String value){
//       int whereAt = value.indexOf("@");
//       int whereDot = value.lastIndexOf(".");
////       if (whereAt > 0 && whereAt > 0){
////           return true;
        Pattern pat = Pattern.compile("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$"); //factory
        Matcher mat = pat.matcher(value); // factory
        return mat.matches();

    }
    public boolean isValidName(String value){
        Pattern pat1 = Pattern.compile("^[a-z][a-z_]{2,15}$");
        Matcher mat1 = pat1.matcher(value);
        return mat1.matches();

    }
    public boolean isStrongPassword(String value){
        Pattern pat2 = Pattern.compile("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$\n");
        Matcher mat2 = pat2.matcher(value);
        return mat2.matches();
    }
}
