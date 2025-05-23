package AshokIt.exception;

public class InvalidNo extends RuntimeException
{
    public InvalidNo(String msg) {
        super(msg);
    }

    public InvalidNo(String str) {
        super(str);
    }
}
