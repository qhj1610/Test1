package testSort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author qhj
 * @Date 2018-04-09
 * @deprecated 对集合中的元素进行自定义排序
 */
public class SortByName {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("jack");
        student1.setAge(10);
        student1.setSalary(new BigDecimal(5000));
        Student student2 = new Student();
        student2.setName("rose");
        student2.setAge(20);
        student2.setSalary(new BigDecimal(3000));
        Student student3 = new Student();
        student3.setName("Bob");
        student3.setAge(30);
        student3.setSalary(new BigDecimal(8000));
        list.add(student1);
        list.add(student2);
        list.add(student3);

        /**
         * 通过匿名内部类的方式，创建 Comparator 接口的实现类并且重新 compare 方法。
         * compare 方法返回的是一个基本类型的整型，
         * 如果要按照升序排序则： o1 > o2 返回 1（正数） ，o1 = o2 返回 0 ，o1 < o2 返回 -1（负数）；
         * 如果要按照降序排序则： o1 > o2 返回 -1（负数） ，o1 = o2 返回 0 ，o1 < o2 返回 1（正数）
         */
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getSalary().compareTo(o2.getSalary());//按照工资排升序
                //return o2.getSalary().compareTo(o1.getSalary());//按照工资排降序
                return -(o1.getSalary().compareTo(o2.getSalary()));//按照工资排降序
            }
        });

        System.out.println("按照工资排升序，结果如下：");
        for (int i = 0;i<list.size();i++){
            System.out.println("姓名："+list.get(i).getName()+"----年龄："+list.get(i).getAge()+"----工资："+list.get(i).getSalary());
        }
    }


}
