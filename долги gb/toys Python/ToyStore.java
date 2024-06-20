package hw02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class ToyStore {
    private List<Toy> toys; // Список доступных игрушек в магазине
    private List<Toy> prizeList; // Список игрушек, ожидающих выдачу
    private int prize = 0;

    public ToyStore() {
        this.toys = new ArrayList<>();
        this.prizeList = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void getPrize() {

        for (Toy toy : toys) {
            prize += toy.getQuantity();
        }
        if (prize == 0) {
            System.out.println("Игрушки закончились! Необходимо добавить новые");
            return;
        }
        prize = 0;
        // Вычисляем общую частоту выпадения всех игрушек
        double totalWeight = toys.stream().mapToDouble(Toy::getWeight).sum();
        // Генерируем случайное значение в диапазоне от 0 до totalWeight
        double randomValue = new Random().nextDouble() * totalWeight;
        for (Toy toy : toys) {
            randomValue -= toy.getWeight();
            if (randomValue <= 0) {
                if (toy.getQuantity() == 0) {
                    System.out.println("Игрушки " + toy.getName() + " Закончились!");
                    break;
                }
                prizeList.add(toy);
                break;
            }
        }
        // Если есть выигранная игрушка, выводим сообщение и записываем в файл
        if (!prizeList.isEmpty()) {
            Toy winer = prizeList.remove(0);
            System.out.println("Поздравляем! Вы выиграли игрушку: " + winer.getName());
            winer.setQuantity(winer.getQuantity() - 1);
            // Запись выигранной игрушки в файл
            writeToFile(winer);
        } else {
            System.out.println("Ничего не выиграно.");
        }
    }

    // Метод для записи выигранной игрушки в файл
    private void writeToFile(Toy toy) {
        File file = new File("result.txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("ID: " + toy.getId() + ", Название: " + toy.getName());
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для вывода доступных игрушек
    public void printAvailableToys() {
        System.out.println("Доступные игрушки:");
        for (Toy toy : toys) {
            System.out.println("ID: " + toy.getId() + ", Название: " + toy.getName() + ", Количество: " + toy.getQuantity() + ", Частота выпадения: " + toy.getWeight() + "%");
        }
        System.out.println();
    }

    // Метод для добавления новой игрушки с автоматическим присвоением id
    public void addNewToy() {
        Scanner scanner = new Scanner(System.in);
        // Используем id последнего элемента списка + 1
        int newId = toys.isEmpty() ? 1 : toys.get(toys.size() - 1).getId() + 1;

        System.out.print("Введите название игрушки: ");
        String name = scanner.nextLine();

        System.out.print("Введите количество игрушки: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректный ввод. Введите число!");
            System.out.print("Введите новое количество игрушки: ");
            scanner.next();
        }
        int quantity = scanner.nextInt();
        System.out.print("Введите частоту выпадения игрушки: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректный ввод. Введите число!");
            System.out.print("Введите новую частоту выпадения (вес) игрушки: ");
            scanner.next();
        }
        int weight = scanner.nextInt();
        Toy newToy = new Toy(newId, name, quantity, weight);
        toys.add(newToy);
        System.out.println("Новая игрушка успешно добавлена.");
    }

    // Редактируем параметры количество и (вес) частоту выпадения игрушки по Id
    public void changeToy() {
        Scanner scanner = new Scanner(System.in);
        printAvailableToys();
        System.out.print("Введите ID игрушки для изменения параметров: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректный ввод. Введите число!");
            System.out.print("Введите ID игрушки для изменения параметров:");
            scanner.next();
        }
        int id = scanner.nextInt();
        boolean result = false;
        for (Toy toy : toys) {
            if (id == toy.getId()) {
                result = true;
            }
        }
        if (result) {
            System.out.print("Введите новое количество игрушки: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите число!");
                System.out.print("Введите новое количество игрушки: ");
                scanner.next();
            }
            int quantity = scanner.nextInt();
            System.out.print("Введите новую частоту выпадения (вес) игрушки: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите число!");
                System.out.print("Введите новую частоту выпадения (вес) игрушки: ");
                scanner.next();
            }
            int weight = scanner.nextInt();
            for (Toy toy : toys) {
                if (id == toy.getId()) {
                    toy.setQuantity(quantity);
                    toy.setWeight(weight);
                }
            }
            System.out.println("Игрушка с ID " + id + " успешно отредактирована!");
        } else {
            System.out.println("Игрушки с ID " + id + " не существует!");
        }
    }
}