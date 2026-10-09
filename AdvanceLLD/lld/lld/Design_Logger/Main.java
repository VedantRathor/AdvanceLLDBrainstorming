package lld.Design_Logger;

import lld.Design_Logger.Handler.Debug;
import lld.Design_Logger.Handler.Error;
import lld.Design_Logger.Handler.Info;
import lld.Design_Logger.Handler.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Logger working fine...");
        Logger logger = new Info(new Debug(new Error(null)));

        logger.log(Logger.ERROR, "this is debug message");
    }
}
