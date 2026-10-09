package lld.Design_Logger.Handler;

public class Info extends Logger {
    public Info(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int level, String message) {
        if (level == INFO) {
            System.out.println("[INFO] " + message);
        } else {
            super.nextHandler(level, message);
        }
    }
}
