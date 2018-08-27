public enum TestEnum {
    APPLIED("1","applied","已申请(待审核)"),
    UNPASSED("2","unpassed","未通过"),
    SUCCESS("3","success","提现成功"),
    PAYING("4","paying","支付中"),
    FAIELD("5","failed","提现失败");
    private String viewStatu;
    private String DBStatu;
    private String desc;

    public static void main(String[] args) {
        System.out.println(TestEnum.values().length);
        TestEnum testEnum = TestEnum.APPLIED;
        System.out.println("DBStatu:"+testEnum.getDBStatu());
    }
    private TestEnum(String viewStatu,String DBStatu,String desc ) {
        this.viewStatu = viewStatu;
        this.DBStatu = DBStatu;
        this.desc = desc;
    }

    public String getViewStatu() {
        return viewStatu;
    }

    public void setViewStatu(String viewStatu) {
        this.viewStatu = viewStatu;
    }

    public String getDBStatu() {
        return DBStatu;
    }

    public void setDBStatu(String DBStatu) {
        this.DBStatu = DBStatu;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
