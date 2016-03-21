package cs2105teamc.twitterREST;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class CTTemplate {
	private String consumerKey = "95p1GHyf0qHplNMcJCjlDpArY";
	private String consumerSecret = "uoTrWUWCqHEul2zgXS6bVZtrJS7U1CpFB6WxMkW6vgVI7OfeW9";
	private String accessToken = "4830664103-4GWULAlsO57vCAbZYtOB1rSYxD0hEwW91Rcazim";
	private String accessTokenSecret = "3hFyaG5AWiGF6AMW0ZNMpAMNlpBzePjYFUAd9CxdkJzcQ";
	
	public Twitter getTemplate () {
		TwitterTemplate cs2105 = new TwitterTemplate(consumerKey,consumerSecret,accessToken,accessTokenSecret);
		return cs2105;
		
	}

}
