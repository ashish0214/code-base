package Exception;

public class InvalidException extends RuntimeException{

    //in this case the message is passed to the Throwable class method class called getMethod

    //the super is  calling the constructor of the Throwable class there it is being initiaalize
    InvalidException(String message){
        super(message);
    }
    InvalidException(){}
}
