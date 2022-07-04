package itsj.thanhtrong.request;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 11:18
 * Filename : RequestMessgae
 */
public class RequestMessage {
    private String message;

    public RequestMessage() {
    }

    public RequestMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
