package dz_seminar_6;

import java.util.*;

public class Main_dz_seminar_6 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        // Заполняем телефонную книгу
        addContact(phoneBook, "Иван Иванов", "123-456-7890");
        addContact(phoneBook, "Мария Петрова", "987-654-3210");
        addContact(phoneBook, "Иван Сидоров", "111-222-3344");
        addContact(phoneBook, "Иван Иванов", "555-123-4567");
        addContact(phoneBook, "Иван Сидоров", "111-222-3344");
        addContact(phoneBook, "Иван Сидоров", "111-222-3344");

        // Выводим телефонную книгу отсортированную по убыванию числа телефонов
        for (String name : sortByNumberOfPhones(phoneBook)) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }
    private static void addContact(HashMap<String, List<String>> phoneBook, String name, String phone) {
        // Получаем список телефонов для данного имени
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());

        // Добавляем телефон в список
        phones.add(phone);

        // Обновляем список телефонов для данного имени
        phoneBook.put(name, phones);
    }
    // Сортирует телефонную книгу по убыванию числа телефонов
    private static List<String> sortByNumberOfPhones(HashMap<String, List<String>> phoneBook) {
        // Преобразуем HashMap в список пар имя-список телефонов
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());

        // Сортируем список по убыванию числа телефонов
        Collections.sort(entries, (a, b) -> b.getValue().size() - a.getValue().size());

        // Извлекаем имена из отсортированного списка
        List<String> sortedNames = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : entries) {
            sortedNames.add(entry.getKey());
        }
        return sortedNames;
    }
}
