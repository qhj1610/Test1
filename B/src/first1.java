import com.sun.org.apache.xml.internal.security.c14n.helper.AttrCompare;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class first1 {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println("date格式："+date1);





        Map<Integer,String> map =new HashMap<Integer,String>();
        map.put(1,"jack");
        map.put(2,"rose");
        map.put(3,"tom");
        System.out.println(map.get(2));




        Set<Map.Entry<Integer,String>> entry = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iter=entry.iterator();
        for (Map.Entry<Integer,String> entry1:map.entrySet()){
            entry1.getValue();
        }
        while(iter.hasNext()){
            System.out.println(iter.next().getValue());
        }




        Collection<String> c1=map.values();
        System.out.println(c1);
        Set<Integer> set=map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer i =iterator.next();
            System.out.println(i);
            System.out.println(map.get(i));
        }
        System.out.println(c1);
        System.out.println(set);








        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,12,10);
        Date before = calendar.getTime();
        Date date =  new Date();
        System.out.println("datebefore:"+date.compareTo(before));
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd,hh:mm:ss");
        String now = sdf.format(date);
        int i = now.compareTo("2015-01-12");
        System.out.println(now);
        System.out.println("i:"+i);




    }
}

