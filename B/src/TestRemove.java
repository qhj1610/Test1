import java.util.ArrayList;
import java.util.List;

public class TestRemove {

    public static void main(String[] args) {

        String s = "|finance|balance-list|";
        String[] strings =s.split("\\|");
        System.out.println(strings.length);
        System.out.println(strings[0].isEmpty());
        System.out.println("----");
        System.out.println(strings[1]);
        System.out.println("-------");
        System.out.println(strings[2]);
        System.out.println("----");

        Long l =123L;
        System.out.println(l==123);//true
        System.out.println(l.equals(123));//false
        System.out.println(l.equals(123l));//true
        System.out.println(l.equals(123L));//true



    }
}
