package testStream;

import testSort.Student;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TestStream {

    public static void main(String[] args) {

        Student s1 = new Student("jack",20,new BigDecimal(1000));
        Student s2 = new Student("rose",50,new BigDecimal(500));
        Student s3 = new Student("bob",80,new BigDecimal(1500));
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);



        List<Student> list = students.subList(0,0);
        list.stream().forEach(t->{
             System.out.println("Name:"+t.getName());
        });


//        int sumAge = students.stream().map(student ->student.getAge()).reduce(0,(a,b)->a+b);
//
//        BigDecimal sumSalary = students.stream().map(student ->student.getSalary()).reduce(BigDecimal.ZERO,(a,b)->a.add(b));

//        BigDecimal sum = students.stream().map(student -> student.getSalary()).reduce(BigDecimal.ZERO,BigDecimal::add);
//
//        System.out.println(sum);




//        students.stream();
//
//        System.out.println("sumAge:"+sumAge);
//
//        System.out.println("sumSalary:"+sumSalary);
//
//        int age = students.stream().collect(Collectors.summingInt(Student::getAge));
//        System.out.println(age);

       // OptionalInt optionalInt = students.stream().mapToInt(Student::getAge).max();

        //System.out.println( "max age:"+optionalInt.getAsInt());

        //List<Student> studentList = students.stream().filter(student -> student.getName().equals("jack")).collect(toList());

        //List<Student> studentList1 = students.stream().skip(1).collect(toList());
        //List<String> list =  students.stream().map(Student :: getName).collect(toList());
//        for (String s: list
//             ) {
//            System.out.println(s);
//        }

        // jack
        // rose


        //System.out.println("studentList1Size:"+studentList1.size()+",name:"+studentList1.get(0).getName()); //studentListSize:1,name:jack


//        String[] names = {"zhangsan","lisi","wangwu"};
//        Stream<String> stream1 = Arrays.stream(names);
//
//
//        Stream<String> stream2 = Stream.of("zhangsan","lisi","wangwu");

//        try(Stream lines = Files.lines(Paths.get("文件路径名"),Charset.defaultCharset())){
//            //可以对 lines 做一些操作
//        }catch (IOException e){
//            e.printStackTrace();
//        }













    }
}
