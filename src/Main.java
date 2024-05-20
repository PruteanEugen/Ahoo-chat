import student.examples.chat.services.AuthService;
import student.examples.chat.services.MessagingService;
import stundent.examples.chat.entities.Message;
import stundent.examples.chat.entities.User;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Entity user1 = new User(12, "Ion","1233",new Date(),'m', "ion@gmail.com");
//        System.out.println(((Entity)user1).toString());
//
//        Message msg = new Message(45, "Hello World");
//        System.out.println(msg.getId());
//
//        Validator validator = new Validator();
//        validator.isString("abc");
//        validator.isString(new User());
//
//        validator.isStrongPassword("Trunk123!");
//        User [] blackListUsers = {null,null,null};
//        blackListUsers [1] = new User(11, "BlackUser","1233",new Date(),'m', "ion@gmail.com");
//
//
//
//
//        User user1 = new User(12, "Ion","1233",new Date(),'m', "ion@gmail.com");
//        authService.signUp(user1);
//        User user2 = user1;
//
//        authService.setUsers(blackListUsers);
//
//        user2.setUsername("User2");
//        authService.getUsers()[1].setUsername("Marry");
////        authService.getUsers()[1]= null;
//
//        //Cache for
//        User [] users = authService.getUsers();
//        System.out.println(users);
//        for(int i =0; i< users.length; i++ ){
//            System.out.println(authService.getUsers()[i]);

        //  }
//            MessagingService messagingService = new MessagingService(3);
//
//        messagingService.send(new Message(1, "Hello Bob", new Date()));
//        messagingService.send(new Message(2, "Hello Eveline", new Date()));
//        messagingService.send(new Message(3, "Hello everyone", new Date()));
//     //  messagingService.send(new Message(4, "Hello everyone", new Date()));
//
//        System.out.println("\n All messages:");
//        messagingService.printMessages();
//


        AuthService authService = new AuthService();
        int userCount=0;
        while (userCount < 10){
            User u = new User(12, "Marcel","2222",new Date(),'m', "Marcel@gmail.com");
            authService.signUp(u);
            userCount++;

        }

    }
}
