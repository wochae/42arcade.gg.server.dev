package io.pp.arcade.global.util;

import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Component
@AllArgsConstructor
public class AsyncMailSender {
    private final JavaMailSender javaMailSender;

    @Async("mailExecutor")
    public void send(MimeMessage message) {
        javaMailSender.send(message);
    }
}
