package teststring;


public class Test1 {

    public static void main(String[] args) {

        String dingMsg="{\"msgtype\": \"markdown\",\"markdown\": {\"title\":\"报警消息\"," +
                "\"text\":\"# **新系统交易结算队列堆积警告**   \n\n " +
                "\n #### 卖出队列size=" + 100+
                "\n #### 买入队列size=" + 50+
                "\n #### limitSize =" +200+
                "\n #### clearQueueSign is " +true+
                "\n   \"}," +
                "\"at\": {\"atMobiles\": [\"13758080693\"], \"isAtAll\": true}}";

        String s1 = "ceshi\"55\\n\"";

       System.out.println(s1);

        //System.out.println(dingMsg);


    }


}
