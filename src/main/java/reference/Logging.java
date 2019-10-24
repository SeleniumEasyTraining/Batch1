package reference;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logging {

	static{

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		System.setProperty("current.date.time", dateFormat.format(new Date()));
	}

	static Logger log = Logger.getLogger(Logging.class);


	public static void main(String[] args) {

		log.info("Starting the browser");

		log.info("Navigating to url");

		log.info("Entering the username and passsword");

		log.info("Click on Submit button");

		log.info("Verify homepage is displayed");

	}



}
