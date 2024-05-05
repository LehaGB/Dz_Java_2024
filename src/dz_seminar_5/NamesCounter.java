package dz_seminar_5;

import java.util.HashMap;
import java.util.Map;

public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Введите свое решение ниже
        if (names.containsKey(name)) {
            // Если имя уже есть, увеличиваем счетчик
            names.put(name, names.get(name) + 1);
        } else {
            // Если имени нет, добавляем его с начальным счетчиком 1
            names.put(name, 1);
        }
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
//        // Введите свое решение ниже
//        // Итерируемся по HashMap с помощью набора записей
//        StringBuilder sb = new StringBuilder("{");
//        System.out.print("{");
//        for (Map.Entry<String, Integer> entry : names.entrySet()) {
//            // Печатаем имя и количество его вхождений
//            sb.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
//        }
//        sb.setLength(sb.length() - 2);
//        sb.append("}");
//
//        // Печатаем строку
//         System.out.println(sb);
        System.out.println(names);

    }
}
