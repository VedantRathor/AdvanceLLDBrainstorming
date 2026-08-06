package Design_Logger.Handler;

public class Error extends Logger {
    public Error(Logger logger) {
        super(logger);
    }
    @Override
    public void log(int level, String message) {
        if (level == ERROR) {
            System.out.println("[ERROR] " + message);
        } else {
            super.nextHandler(level, message);
        }
    }
}
