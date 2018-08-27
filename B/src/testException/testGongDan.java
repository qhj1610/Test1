package testException;

/**
 * 工单生成类
 * 格式 String  GD000000
 */

public class testGongDan {

    public static void main(String[] args) {
        System.out.println(getWorkerOrderNum("GD000199"));
    }

    public static String getWorkerOrderNum(String num){
        String workerOrderNum = "GD000000";
        if (!isNullStr(num)){
            workerOrderNum = num;
        }
        String numStr = workerOrderNum.substring(2,8);
        if ("999999".equals(numStr)){
            numStr = "000000";
        }
        int a = Integer.valueOf(numStr)+1;
        int leng = numStr.length() - String.valueOf(a).length();
        String zero = "";
        for (int i=0;i<leng;i++){
            zero += "0";
        }
        return "GD"+zero+a;
    }

    public static boolean isNullStr(String param){

        if (null == param || "".equals(param)){
            return true;
        }
        return false;
    }
}
