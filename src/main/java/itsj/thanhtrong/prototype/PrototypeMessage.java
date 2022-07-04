package itsj.thanhtrong.prototype;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 11:13
 * Filename : ProtoypeMessage
 */
public class PrototypeMessage {
    private String message;
    public void setMessage(String message){
        this.message=message;
    }

    public void getMessage() {
        System.out.println("Your message: "+message);
    }
}
