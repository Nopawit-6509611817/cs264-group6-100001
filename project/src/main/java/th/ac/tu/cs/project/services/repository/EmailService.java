package th.ac.tu.cs.project.services.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendEmailToTeacher(String teacherName) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("Approval Request");
        message.setText("Dear " + teacherName + ",\n\nYou have pending approval requests.");

        // Replace with the teacher's email address
        message.setTo("teacher-email@example.com");

        javaMailSender.send(message);
    }
}
