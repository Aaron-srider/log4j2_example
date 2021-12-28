import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void main(String[] args) {
        logger.error("hello");

        logger.info("info");

        logger.debug(long_duration_task());

        if (logger.isDebugEnabled()) {
            logger.debug(long_duration_task());
        }

    }


    public static String long_duration_task() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "long_duration_task";
    }


}
