package Design_Logger.Handler;

public class Debug extends Logger {
    public Debug(Logger logger) {
        super(logger);
    }
    @Override
    public void log(int level, String message) {
        if (level == DEBUG) {
            System.out.println("[DEBUG] " + message);
        } else {
            super.nextHandler(level, message);
        }
    }
}
