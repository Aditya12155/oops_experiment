final class Logger {
   
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// class ExtendedLogger extends Logger { //Compilation error: Cannot inherit from final class Logger
//     void customLog(String message) {
//         System.out.println("Custom Log: " + message);
//     }
// }



public class exp6_4 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("This is a log message."); // Calling the log method
    }
}
