package Design_Logger.Handler;

public abstract class Logger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    private final Logger next;
    public Logger(Logger next) {
        this.next = next;
    }
    public abstract void log(int level, String message);
    public void nextHandler(int level, String messsage) {
        next.log(level, messsage);
    }
}
