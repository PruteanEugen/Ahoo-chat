import student.examples.chat.services.AuthService;
import student.examples.chat.services.IndentificationService;
import student.examples.chat.services.MessagingService;
import stundent.examples.chat.entities.Message;
import stundent.examples.chat.entities.User;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{

AuthService authService = new AuthService();
    IndentificationService indentificationService = new IndentificationService();

    User u1 = new User(indentificationService.getID(), "Marcel","123",new Date(),'m', "Marcel@gmail.com");
    String hash = authService.encryptUserPassword(u1);
        System.out.println(hash);

    }
}
