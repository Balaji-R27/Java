

public class LoggerImp {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.debug("debug level " + logger.debugLevel+logger);
        logger.debugLevel = 6;
        logger.info("info at level " + logger.debugLevel+logger);
    }
}
