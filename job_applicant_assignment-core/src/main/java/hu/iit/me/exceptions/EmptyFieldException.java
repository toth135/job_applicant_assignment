package hu.iit.me.exceptions;

public class EmptyFieldException extends Exception {

    public EmptyFieldException() {
        super();
    }

    public EmptyFieldException(String s) {
        super(s);
    }

    public EmptyFieldException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public EmptyFieldException(Throwable throwable) {
        super(throwable);
    }

    protected EmptyFieldException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
