package dz_seminar_5;

public class Printer {
    public static void main(String[] args) {
        // Вывод на экран первой задачи
//        String name1;
//        String name2;
//        int phone1;
//        int phone2;
//
//        if (args.length == 0) {
//            name1 = "Ivanov";
//            name2 = "Petrov";
//            phone1 = 123456;
//            phone2 = 654321;
//        } else {
//            name1 = args[0];
//            name2 = args[1];
//            phone1 = Integer.parseInt(args[2]);
//            phone2 = Integer.parseInt(args[3]);
//        }
//
//        PhoneBook myPhoneBook = new PhoneBook();
//        myPhoneBook.add(name1, phone1);
//        myPhoneBook.add(name1, phone2);
//        myPhoneBook.add(name2, phone2);
//
//        System.out.println(myPhoneBook.find(name1));
//        System.out.println(PhoneBook.getPhoneBook());
//        System.out.println(myPhoneBook.find("Me"));

        String name1;
        String name2;
        String name3;
        String name4;
        String name5;

        if (args.length == 0) {
            name1 = "Elena";
            name2 = "Elena";
            name3 = "Elena";
            name4 = "Elena";
            name5 = "Ivan";
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
        }
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);

        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}
