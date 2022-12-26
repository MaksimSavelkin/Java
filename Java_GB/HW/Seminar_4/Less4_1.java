// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package gb.Java_GB.HW.Seminar_4;
import java.util.LinkedList;
import java.util.Collections;
public class Less4_1 {
    public static void main(String[] args) {
        LinkedList<Object> arrlink = new LinkedList<Object>();
        arrlink.add("Start");
        arrlink.add(2);
        arrlink.add(3);
        arrlink.add(4);
        arrlink.add(5);
        arrlink.add("End");
        System.out.println(arrlink.toString());
        revertList(arrlink);
        System.out.println(arrlink);
    }


    public static LinkedList<Object> revertList(LinkedList<Object> myList) {
        Collections.reverse(myList);
        return myList;
    }

    
}
