package ie.atu.MovieProjectCICD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MovieProjectCicdApplication {
 @Autowired
 private EmailSender sender;
	public static void main(String[] args) {
		SpringApplication.run(MovieProjectCicdApplication.class, args);

	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		sender.sendEmail("g00395612@atu.ie", "Movie", "Hello Mr Muldoon I want to talk to you about your upcoming film");
	}

}
