//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package gb.Java_GB.HW.Seminar_5;
import java.util.HashMap;
import java.util.Map;
public class Less5_1 {
    public static void main(String[] args) {
        Map<String, String> phone_book = new HashMap<>();
        phone_book.put("Иванов Иван ", " 12345");
        phone_book.put("Петрова Мария ", " 23456, 34567");
        phone_book.put("Васильев Василий ", " 45678");
        phone_book.put("Ольгина Ольга ", " 56789");
        phone_book.put("Сидорова Анна ", " 67890, 01234");
        System.out.println(phone_book);

        add_user(phone_book, "Смирнов Сергей ", " 54321");
        del_user(phone_book, "Сидорова Анна ");

        System.out.println(phone_book);

    }

    public static void add_user(Map<String, String> dict, String name, String phone_number) {
        dict.put(name, phone_number);
    }

    public static void del_user(Map<String, String> dict, String name) {
        dict.remove(name);
    }
    
}