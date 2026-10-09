package ZRoughWork.Logger;

public class Warning extends Logger {
    public Warning(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int level, String message) {
        if (level == Logger.WARNING) {
            System.out.println("[WARNING] " + message);
        } else {
            super.next(level, message);
        }
    }
}
