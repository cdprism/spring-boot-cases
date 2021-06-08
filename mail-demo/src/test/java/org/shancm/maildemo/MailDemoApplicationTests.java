package org.shancm.maildemo;

import org.junit.jupiter.api.Test;
import org.shancm.maildemo.service.MailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;

@SpringBootTest
class MailDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private MailSendService mailSendService;
    @Test
    void mail() throws MessagingException {

//            mailSendService.sendSimpleMail("1365904133@qq.com", "subject", "content");
//        mailSendService.sendTemplateMail("1365904133@qq.com", "Review a product on Amazon and keep it for free");
//        mailSendService.sendTemplateMail("lancelot.shan@gentlen168.com", "Review a product on Amazon and keep it for free");
        mailSendService.sendTemplateMail("ruan-shan@163.com", "Review a product on Amazon and keep it for free");

    }
}
