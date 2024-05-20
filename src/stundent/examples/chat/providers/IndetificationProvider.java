package stundent.examples.chat.providers;

import static java.lang.Math.random;

public class IndetificationProvider {
    public static final int UPPER_LIMIT = 1000000;
    public static final int LOWER_LIMIT = 1;
    public int provide(){
     int id = (int) (Math.random() * UPPER_LIMIT) + LOWER_LIMIT;
     if (id > UPPER_LIMIT){
         id = UPPER_LIMIT;
     }
        return id;
    }
}
