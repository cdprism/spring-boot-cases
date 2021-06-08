package org.shancm.maildemo.service.impl;

import org.shancm.maildemo.service.MailSendService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @Classname MailSendServiceImpl
 * @Description TODO
 * @Date 2021/6/8 10:57
 * @Created by S.cm
 */
@Service
public class MailSendServiceImpl implements MailSendService {

    @Value("${spring.mail.username}")
    private String from;

    private final JavaMailSender javaMailSender;
    private final TemplateEngine templateEngine;

    public MailSendServiceImpl(JavaMailSender javaMailSender, TemplateEngine templateEngine) {
        this.javaMailSender = javaMailSender;
        this.templateEngine = templateEngine;
    }

    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        // 发件人
        simpleMailMessage.setFrom(from);
        // 收件人
        simpleMailMessage.setTo(to);
        // 邮件主题
        simpleMailMessage.setSubject(subject);
        // 邮件内容
        simpleMailMessage.setText(content);
        javaMailSender.send(simpleMailMessage);
    }

    @Override
    public void sendTemplateMail(String to, String subject) throws MessagingException {
        Context context = new Context();
        context.setVariable("customer","buyer");

        String emailContent = templateEngine.process("mailTemplate", context);
        sendHtmlMail(to,subject,emailContent);
    }

    public void sendHtmlMail(String to, String subject, String content) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        helper.setFrom(from);

//        FileSystemResource res = new FileSystemResource(new File("D:\\workspace\\idea-workspace\\spring-boot-cases\\mail-demo\\src\\main\\resources\\static\\8-1.jpg"));
//        helper.addInline("image", res);

        javaMailSender.send(message);
    }
}
