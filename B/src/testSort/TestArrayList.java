package testSort;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(0,"j");

        for(String s:list){
            System.out.println(s);
        }

    }
}
