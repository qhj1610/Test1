package testStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import static java.util.stream.Collectors.toList;

/**
 * java 8 新特性测试合并流
 *
 * created on 2018-05-24 10:57 by qhj
 */
public class TestFlagmap {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("I am a boy");
        list.add("I love the girl");
        list.add("But the girl loves another girl");

        /**
         * step 1 : 首先将 list 变成流
         */
//        list.stream();

        /**
         * step 2 : 按空格分词（分完词之后，每个元素变成了一个 String[] 数组）
         */
  //      list.stream().map(s -> s.split(" "));

        /**
         * step 3 : 将每个 String[] 变成流(此时，一个大流里面包含了一个个小流)
         */
    //    list.stream().map(s -> s.split(" ")).map(Arrays::stream);

        /**
         * step 4 : 将一个个小流合并成一个大流，用 flatmap 替换刚才的 map
         */
      //  list.stream().map(s -> s.split(" ")).flatMap(Arrays::stream);

        /**
         * step 5 : 去重
         */
        List<String> list1 = list.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).distinct().collect(toList());

        list1.stream().forEach(s -> System.out.println(s));

        Optional<String> optional = list1.stream().findFirst();
        System.out.println("optional:"+optional.get());


    }
}
