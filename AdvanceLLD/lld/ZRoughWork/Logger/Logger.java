package ZRoughWork.Logger;

public abstract class Logger {private final Logger nextLogger;
    public static int INFO = 1;
    public static int ERROR = 2;
    public static int WARNING = 3;

    public Logger(Logger logger) {
        this.nextLogger = logger;
    }

    public abstract void log(int level, String message);
    public void next(int level, String message) {
        if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }

}
