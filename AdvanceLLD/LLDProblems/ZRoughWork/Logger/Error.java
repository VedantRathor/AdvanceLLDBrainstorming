package ZRoughWork.Logger;

public class Error extends Logger {
    public Error(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int level, String message) {
        if (level == Logger.ERROR) {
            System.out.println("[ERROR] " + message);
        } else {
            super.next(level, message);
        }
    }
}
