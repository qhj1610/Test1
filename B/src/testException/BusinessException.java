package testException;

/**
 * 测试Runtime异常是否需要在方法上throws申明抛出
 * @author QHJ
 * @DATE 2017/11/1 17:19
 */
public class BusinessException extends RuntimeException {
    private EnumCode enumCode;
    private String msg;

    public BusinessException(EnumCode enumCode,String msg){
        this.enumCode = enumCode;
        this.msg = msg;
    }

    public EnumCode getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(EnumCode enumCode) {
        this.enumCode = enumCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
