package info.yannxia.java.error;

/**
 * Created by yann on 16/6/14.
 */
public class Error {

    private final String ex;
    private final Integer no;

    public Error(String ex, Integer errorNo) {
        this.ex = ex;
        this.no = errorNo;
    }

    public String getEx() {
        return ex;
    }

    public Integer getNo() {
        return no;
    }
}
