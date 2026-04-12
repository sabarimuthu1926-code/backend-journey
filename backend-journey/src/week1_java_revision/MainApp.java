package week1_java_revision;

import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int value = 0;
        UserService service = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (value != 4) {
            System.out.println("1. Create User");
            System.out.println("2. Find user By ID");
            System.out.println("3. Show All");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter ID:");
                        if (!scanner.hasNextLong()) {
                            System.out.println("❌ ID must be a number");
                            scanner.next();
                            break;
                        }

                        Long id = scanner.nextLong();

                        System.out.println("Enter Name");
                        String name = scanner.next();

                        System.out.println("Enter Email");
                        String email = scanner.next();

                        service.createUser(id, name, email);
                        System.out.println("User Created");

                    } catch (DuplicateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Enter the Number");
                    Long idNum = scanner.nextLong();
                    try {
                        User userInfo = service.getUserById(idNum);
                        System.out.println("Id : " + userInfo.getId() +
                                " Name: " + userInfo.getDisplayName() +
                                " Email: " + userInfo.getEmail());
                    } catch (UserNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    Map<Long, User> users = service.findAllUsers();
                    users.forEach((idNumber, user) -> {
                        System.out.println(
                                "ID: " + user.getId() +
                                        ", Name: " + user.getDisplayName() +
                                        ", Email: " + user.getEmail()
                        );
                    });
                    break;

                case 4:
                    value = 4;
                    break;
            }
        }
    }
}
