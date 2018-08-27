package testQueue;

import java.util.LinkedList;
import java.util.Queue;

public class testLinkedList {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("张三");
        queue.offer("李四");
        queue.offer("王五");
        queue.offer("赵六");

        System.out.println("------开始遍历队列，不移除元素--------");
        //方法一: 不移除元素
        for (String s:queue){
            System.out.println(s);
        }
        System.out.println("-----开始遍历队列，移除元素---------");

        //方法二：移除元素
        while (queue.peek() != null){
            System.out.println(queue.poll());
        }

        System.out.println("----queue 的大小 ："+queue.size());

    }
















}
