public class Logger {
    public int debugLevel = 1;
    
    public void debug(String logLine) {
        System.out.println("Debug: " + logLine);
    }
    
    public void info(String logLine) {
        System.out.println("Info: " + logLine);
    }
}