package banking;


import banking.repository.ServiceRepoImpl;
import banking.repository.ServicesRepository;

import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {

        ServicesRepository repository = new ServiceRepoImpl();

        while (true) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Choose options:\n" +
                    "1 ->SignUp.\n" +
                    "2 -> Get all users.\n" +
                    "3 -> ...\n");
            String options = myObj.nextLine();

            switch (options){
                case "1":
                    System.out.println("Enter firstname:");
                    String firstname = myObj.nextLine();
                    System.out.println("Enter lastname:");
                    String lastname = myObj.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = myObj.nextLine();
                    System.out.println("Enter address:");
                    String address = myObj.nextLine();

                    String result = repository.register(
                            firstname,
                            lastname,
                            phoneNumber,
                            address
                    );

                    System.out.println(result);
                    break;
                case "2":
                    System.out.println(repository.getUsers().toString());
                    break;
                default:

            }
        }
    }
}
