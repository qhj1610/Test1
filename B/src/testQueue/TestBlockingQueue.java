package testQueue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * 测试阻塞队列
 * @Author qhj
 * @Date 2018-05-28
 */
public class TestBlockingQueue {


    public static void main(String[] args) {

        BlockingQueue blockingQueue = new ArrayBlockingQueue(10);

        //创建一个可缓存线程池
        ExecutorService poll = Executors.newCachedThreadPool();

        //创建一个定长线程池,大小为 5
        ExecutorService pool1 = Executors.newFixedThreadPool(5);

        //
        /**
         * 创建一个定长线程池，支持定时及周期性任务执行
         *  参数：
         * corePoolSize - 池中所保存的线程数，即使线程是空闲的也包括在内
         */
        ScheduledExecutorService pool2 = Executors.newScheduledThreadPool(5);

        /**
         *创建一个定长线程池，支持定时及周期性任务执行
         * 参数：
         *      corePoolSize - 池中所保存的线程数，即使线程是空闲的也包括在内
         *      threadFactory - 执行程序创建新线程时使用的工厂
         * 抛出：
         *      IllegalArgumentException - 如果 corePoolSize < 0
         *      NullPointerException - 如果 threadFactory 为 null
         *
         */
        ScheduledExecutorService pool3 = Executors.newScheduledThreadPool(5, (r) -> {return new Thread(r);});





        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task 1";
            }
        });

        callables.add(()->"task 3");

        callables.add(()->{return "task 2";});



        try {
            List<Future<String>> result = pool3.invokeAll(callables);
             result.stream().forEach(item->{
                 try {
                     System.out.println(item.get());
                 }catch (Exception e){
                     e.printStackTrace();
                 }

                     }

             );//结果不确定，Callable 集合中任意一个执行任务的返回值都有可能
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            pool3.shutdown();
        }






        /**
         * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序（FIFO/LIFO/优先级）执行
         */
//        ExecutorService pool4 = Executors.newSingleThreadExecutor();
//
//        Future future = pool4.submit(new Callable() {
//            @Override
//            public Object call() throws Exception {
//                System.out.println("任务执行...");
//                return "this is Callable";
//            }
//        });
//
//        try{
//            System.out.println("future:"+future.get());  //输出:this is Callable
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            pool4.shutdown();
//        }

        //循环向线程池提交任务
//        for (int i = 0;i<1000;i++){
//            pool1.submit(()->{
//                System.out.println(Thread.currentThread().getName());
//            });
//        }


        //延迟 10秒执行任务
//        for (int i = 0;i<1000;i++){
//            pool3.schedule(()-> System.out.println(Thread.currentThread().getName()),10,TimeUnit.SECONDS);
//        }

        //延迟5秒开始执行，每隔10执行一次任务
//        pool3.scheduleAtFixedRate(()-> System.out.println(Thread.currentThread().getName()),5,10,TimeUnit.SECONDS);

















//        for (int i =0;i<11;i++){
//            System.out.println("1111");
//
//                System.out.println(blockingQueue.offer(blockingQueue.poll()));
//
//                System.out.println("22222");
//
//        }



    }


}
