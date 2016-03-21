package cs2105teamc.twitterREST;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;







@Controller
@RequestMapping("/tweet")
public class CTController {
	
	private final AtomicLong counter = new AtomicLong();
	private final CTTemplate testtemplate = new CTTemplate();
	private final Twitter testwtr = testtemplate.getTemplate();
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody CTMessage createMessage(@RequestParam(value="msg", required=true) String msg){
		CTMessage t = new CTMessage (counter.incrementAndGet(), msg);
		System.out.println(t.getMsgid()+t.getContent());
		System.out.println(testwtr.isAuthorized());
		System.out.println(testwtr.userOperations().getScreenName());
		testwtr.timelineOperations().updateStatus(t.getContent());
		return t;
	}		
	
//	@RequestMapping(method=RequestMethod.GET)
//	public @ResponseBody String msgStatus (@RequestParam(value="id", required=true) String id){
//		return Message.getContent();
//		
//	}

}
