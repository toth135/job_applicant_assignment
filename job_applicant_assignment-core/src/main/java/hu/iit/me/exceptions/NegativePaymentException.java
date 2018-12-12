package hu.iit.me.exceptions;

public class NegativePaymentException extends Exception {

    public NegativePaymentException() {
        super();
    }

    public NegativePaymentException(String s) {
        super(s);
    }

    public NegativePaymentException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NegativePaymentException(Throwable throwable) {
        super(throwable);
    }

    protected NegativePaymentException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
