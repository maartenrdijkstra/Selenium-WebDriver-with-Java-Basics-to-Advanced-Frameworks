package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    private static Logger log = LogManager.getLogger(Demo.class.getName());

    public static void main(String[] args) {
        log.debug("I have clicked on this button");
        log.info("Button is displayed");
        log.error("Button is not displayed");
        log.error("I am stating an error log");

        if (2 < 0) {
            log.debug("object is present");
        } else {
            log.error("object is not present");
        }

        if (5 > 4) {
            log.info("Object is present");
        } else {
            log.error("Object is not present");
            log.fatal("this is fatal");
        }

    }
}
/*
Use log. Error()
to log when elements are not displayed in the page or if any validations fail

Use Log. Debug()
When each Selenium action is performed like click, SendKeys, getText()

Use log.info()
When operation is successfully completed ex: After loading page, or after any successful validations
It’s just counterpart to log. Error()
 */
