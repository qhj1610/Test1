import java.util.*;

public class RegularExpression {

    /**
     * 测试正则表达式
     * @param args
     */
    public static void main(String[] args) {

        String str = "0055589";//005   005 4   005 8
        Boolean result =  str.matches("005(\\d{4})?(\\d{4})?$");
        System.out.println(result);

        List list = new Vector();
        List list1 = new LinkedList();
        Map map = new Hashtable();



    }
}
