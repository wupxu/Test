package study.com;

public enum Channel {

    NOTICE(1,"公告"),
    STRATEGY(2,"攻略"),
    ;

    private int code;
    private String msg;

    private Channel(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {

        System.out.println(Channel.NOTICE.getMsg());
    }
}
