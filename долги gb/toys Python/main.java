package hw02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

/** строка 12-14 нужны, чтобы не вводить каждый раз заново список.
 * Только для повышения скорости проверки
  */
       toyStore.addToy(new Toy(1, "Кукла", 2, 20));
        toyStore.addToy(new Toy(2, "Кошка", 5, 40));
        toyStore.addToy(new Toy(3, "Оно", 2, 70));
        toyStore.addToy(new Toy(4, "Зайка", 6, 10));
        toyStore.addToy(new Toy(5, "Настолка", 2, 50));

        Scanner scanner = new Scanner(System.in);

        // Главное меню
        while (true) {
            System.out.println("Добро пожаловать!\n Выберите необходимый пункт меню:\n 1 - Список доступных игрушек\n 2 - Провести розыгрыш\n 3 - Изменить количество и вес игрушки \n 4 - Добавить новую игрушку\n 5 - Выход");
            System.out.print("Выберите действие: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите число!");
                System.out.print("Выберите действие: ");
                scanner.next();
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    toyStore.printAvailableToys();
                    break;
                case 2:
                    toyStore.getPrize();

                    break;
                case 3:
                    toyStore.changeToy();
                    break;
                case 4:
                    toyStore.addNewToy();
                    break;
                case 5:
                    System.out.println("Гуд Бай!.");
                    System.exit(0);
                default:
                    System.out.println("Недопустимая операция. Попробуйте снова!");
            }
        }
    }
}