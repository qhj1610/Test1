
import java.text.SimpleDateFormat;
import java.util.*;

//测试break,跳出循环，跳出标记位置
public class TestBreak {


    private static boolean autoAbandon(boolean alreadyAbandon){
        System.out.println(alreadyAbandon);
        alreadyAbandon = true;

        System.out.println(alreadyAbandon);

        return true;

    }


    private static void t(){
        boolean alreadyAbandon = false;

        System.out.println("22");
        System.out.println("main1    "+alreadyAbandon);
        alreadyAbandon = TestBreak.autoAbandon(alreadyAbandon);
        System.out.println("main2    "+alreadyAbandon);
        if (alreadyAbandon) return;
        System.out.println("44");

    }


    public static void main(String[] args) throws Exception {

        TestBreak.t();









//        Page page = new Page();
//        System.out.println( page.getItems() == null ? 1:2);
//
//
//
//
//        for (int i = 0;i<5;i++){
//            System.out.println(i);
//            if (i == 3){
//                System.out.println("break");
//                continue;
//            }
//        }







//        Calendar start = Calendar.getInstance();
//
//        //1.获取平台最早的日期时间 startTime（登录时间）
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse("2017-12-23");
//        start.setTime(date);
//        System.out.println("date:"+date);
//        Calendar end = Calendar.getInstance();
//        end.setTime(new Date());
//        start.set(start.get(Calendar.YEAR),start.get(Calendar.MONTH),start.get(Calendar.DATE),end.get(Calendar.HOUR_OF_DAY),
//                end.get(Calendar.MINUTE),end.get(Calendar.SECOND));
//        while(start.compareTo(end) == -1 || start.compareTo(end) == 0){
//            //调方法
//            System.out.println(start.getTime());
//            //时间+1天
//            start.add(Calendar.DATE,1);
//        }




    }

    /**
     * 获取前一天的日期
     * @param date
     * @return
     */
//    public static Date getYesterDay(Date date){
//        Calendar c = Calendar.getInstance();
//        c.setTime(date);
//        int day=c.get(Calendar.DATE);
//        c.set(Calendar.DATE,day-1);
//        return  c.getTime();
//    }
//

}
