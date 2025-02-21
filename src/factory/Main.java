package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccessFactory accessFactoryA = new AdminFactory();
        Access accessA = accessFactoryA.CreateAccess();
        AccessFactory accessFactoryM = new ManagerFactory();
        Access accessM = accessFactoryM.CreateAccess();
        AccessFactory accessFactoryU = new UserFactory();
        Access accessU = accessFactoryU.CreateAccess();
        System.out.println("Выберите свою роль: ");
        System.out.println("1. Админ ");
        System.out.println("2. Менеджер");
        System.out.println("3. Клиент");
        int role = scanner.nextInt();
        System.out.println("Выберите команду: ");
        System.out.println("1. Добавить продукт ");
        System.out.println("2. Изменить продукт");
        System.out.println("3. Удалить продукт");
        int command = scanner.nextInt();
        if (role == 1) {
            CreateAccess(accessA, command);
        } else if (role == 2) {
            CreateAccess(accessM, 2);
        } else if (role == 3) {
            CreateAccess(accessU, 3);
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void CreateAccess(Access access, int command) {
        if (command == 1) {
            access.AddProduct();
        } else if (command == 2) {
            access.EditProduct();
        } else if (command == 3) {
            access.DeleteProduct();
        } else {
            System.out.println("Ошибка");
        }
    }
}