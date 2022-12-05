package ie.atu.MovieProjectCICD;


import org.springframework.stereotype.Service;

@Service
public class Email {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail);
}
