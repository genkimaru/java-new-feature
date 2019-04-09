package jdk8.enumeration;

/**
 * @auther guan.c.wang
 * @date 4/9/2019.
 * @see
 */
public enum ErrorCode {

    Fatal(8 , "must stop application") ,
    Error(4 , "should stop application ") ,
    Info(2) ,
    Trace(1){
        @Override
        public String retriveDetail() {
            return super.retriveDetail();
        }
    } ;

    private int code;

    private String msg;

    ErrorCode(int code){
        this.code = code ;
    }

    ErrorCode(int code ,String  msg){
        this.code = code;
        this.msg = msg;
    }

    public String retriveDetail(){
        return "";
    }

}
