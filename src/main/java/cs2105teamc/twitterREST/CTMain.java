package cs2105teamc.twitterREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.social.twitter.api.Twitter;

@SpringBootApplication
public class CTMain {

	public static void main(String[] args) {
		SpringApplication.run(CTMain.class, args);
//		TemplateCreator testtemplate = new TemplateCreator();
//		Twitter testwtr = testtemplate.getTemplate();
//	System.out.println(testwtr.isAuthorized());
//////		testwtr.timelineOperations().updateStatus("Spring test 2");
//	System.out.println(testwtr.userOperations().getScreenName());
		
	}
}
