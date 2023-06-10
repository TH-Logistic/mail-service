package com.thlogistic.mailservice.usecases;

import com.thlogistic.mailservice.adapters.dtos.AccountActivatedRequest;
import com.thlogistic.mailservice.adapters.dtos.ForgetPasswordRequest;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class AccountActivatedUseCaseImpl implements AccountActivatedUseCase {
    private final JavaMailSender emailSender;
    private final SpringTemplateEngine templateEngine;

    @Override
    public Boolean execute(AccountActivatedRequest request) {
        MimeMessage message = emailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
            Context context = new Context();

            helper.setTo(request.getDestinationEmail());
            helper.setSubject("[THLogistic] Your account has been activated");

            context.setVariable("name", request.getName());
            context.setVariable("email", request.getEmail());

            String html = templateEngine.process("account-activated-template", context);
            helper.setText(html, true);
            emailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return true;
    }
}
