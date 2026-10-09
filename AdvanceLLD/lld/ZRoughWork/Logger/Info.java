package ZRoughWork.Logger;

public class Info extends Logger {
    public Info(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int level, String message) {
        if (level == Logger.INFO) {
            System.out.println("[INFO] " + message);
        } else {
            super.next(level, message);
        }
    }
}
