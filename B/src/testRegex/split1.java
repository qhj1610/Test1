package testRegex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class split1 {

    public static void main(String[] args) {

        String s = "[728, 010, 180, 555, 159]";

        String[] s1 = s.split("\\[|]|,");

        System.out.println("index0:"+s1[0]);
        System.out.println("size:"+s.length());
        List<String> spread = new ArrayList<>();

        Arrays.asList(s1).stream().skip(1).forEach(s2 -> spread.add(s2.trim()));
        System.out.println("--"+spread.get(0));
        System.out.println("size:"+spread.size());
        for (String s4 :spread){
            System.out.println("99"+s4);
        }


    }

}
