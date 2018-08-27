package testQueue;

import java.util.Stack;

public class testStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();
        //初始化 stack
        for (int i =0;i < 10;i++){
            stack.push(i);
        }

        System.out.println("-----遍历方法 1---------");
        //遍历方法 1 ：集合遍历方式 不会移除元素
        for (Integer integer: stack){
            System.out.println(integer);
        }


        System.out.println("-----遍历方法 2 -------");
        //遍历方法 2 ：栈弹出遍历方式(先进后出，会移除元素)
        while (!stack.isEmpty()){ // s.peek() != null 这样判断容易抛异常，不建议
            System.out.println(stack.pop());
        }

        System.out.println("----stack 的大小："+ stack.size());// 0






    }
}
