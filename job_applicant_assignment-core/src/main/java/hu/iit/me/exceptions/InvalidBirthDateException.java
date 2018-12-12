package hu.iit.me.exceptions;

public class InvalidBirthDateException extends Exception{

    public InvalidBirthDateException() {
        super();
    }

    public InvalidBirthDateException(String s) {
        super(s);
    }

    public InvalidBirthDateException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public InvalidBirthDateException(Throwable throwable) {
        super(throwable);
    }

    protected InvalidBirthDateException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
