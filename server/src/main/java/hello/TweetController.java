/*
*TweetController:  returns the last 10 tweets from Salesforce 
*using Rest Controller as a List<Status>
*
*/


package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import twitter4j.*;

@RestController
public class TweetController {

    public List<Status> statusList = null;
    
    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/tweets")
    public List<Status> tweets() {
        
    	Twitter twitter = new TwitterFactory().getInstance();
    	try {
      		Paging paging = new Paging(1, 10);
    		statusList = twitter.getUserTimeline("@salesforce",paging);
    		
        } catch (TwitterException te) {
    		System.out.println("Failed to search tweets: " + te.getMessage());
    	}
        return statusList;
    }
}
