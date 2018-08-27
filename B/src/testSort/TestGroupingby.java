package testSort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 测试 java 8 中 Collectors 分组排序等新特性
 */
public class TestGroupingby {

    public static ArrayList<Student> students = new ArrayList();

    public static void main(String[] args) {

        Student s1 = new Student("1",1, BigDecimal.ZERO);
        Student s2 = new Student("1",2, BigDecimal.ZERO);
        Student s3 = new Student("2",3, BigDecimal.ZERO);
        Student s4 = new Student("2",4, BigDecimal.ZERO);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        // 对容器 students 中的 对象按照年龄进行分组
        Map<String,List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));

        for (Map.Entry<String,List<Student>> entry : map.entrySet()){
            System.out.println("key："+entry.getKey()+"    (value 1 age："+entry.getValue().get(0).getAge()
                    +"    value 2 age："+entry.getValue().get(1).getAge()+")");
        }
    }
}
