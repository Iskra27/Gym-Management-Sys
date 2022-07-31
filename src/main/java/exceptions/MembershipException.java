package exceptions;

public class MembershipException extends RuntimeException{

    public MembershipException(Long id) {
        super("Your membership has ended,please renew your membership" );
    }
    public MembershipException(String message) {
        super(message);
    }
}
