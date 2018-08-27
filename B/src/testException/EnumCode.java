package testException;

public enum EnumCode {

    PARAMEXCEPTION(0,"参数异常"),
    SYSTEMEXCEPTION(1,"系统异常");
    private int code;
    private String label;
     EnumCode(int code,String label){
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
