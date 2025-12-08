package day07;

public class InvalidScoreException extends RuntimeException {
    public InvalidScoreException() {
        super("Invalid score value.");
    }
}
