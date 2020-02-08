package ro.iteahome.exceptions.exception;

public class BikeSharingUserAlreadyExistsException extends BikeSharingBusinessException {

        public BikeSharingUserAlreadyExistsException(){
        }

        public BikeSharingUserAlreadyExistsException(String message, Throwable cause) {super(message, cause);}
}
