package ro.iteahome.exceptions.exception;

public class BikeSharingInvalidPasswordFormatException extends BikeSharingBusinessException{

    public BikeSharingInvalidPasswordFormatException(){
    }

    public BikeSharingInvalidPasswordFormatException(String message, Throwable cause) {super(message, cause);}
}