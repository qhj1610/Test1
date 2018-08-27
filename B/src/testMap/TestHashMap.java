package testMap;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**遍历hashMap的方式
 * @author QHJ
 * @Date  2017/11/6
 */
public class TestHashMap {

    public static void main(String[] args) {


        //对一个字符串脱敏
        String str = "abc";
        System.out.println(str.charAt(0)+"****"+str.charAt(str.length()-1));
        System.out.println("+++++");

        Map<Integer,String> map = new HashMap();
        for(int i = 0;i<5;i++){
            map.put(i,"测试");
        }
        firstMethod(map);


    }

    static void  firstMethod(Map map){
        Set<Map.Entry<Integer,String>> entry = map.entrySet();
        for(Map.Entry<Integer,String> s:entry){
            System.out.println("key："+s.getKey());
            System.out.println("value："+s.getValue());
        }
    }






}
