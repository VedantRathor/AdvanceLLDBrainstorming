package ZRoughWork.Logger;

public class Main {
    public static void main(String[] varargs) {
        System.out.println("Logger..");
        Logger logger = new Info(new Error(new Warning(null)));

        logger.log(Logger.INFO, "Saved to DB");
        logger.log(Logger.WARNING, "User Id can be null");
    }
}
