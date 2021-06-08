package org.shancm.maildemo;

import org.junit.jupiter.api.Test;
import org.shancm.maildemo.service.MailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MailDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private MailSendService mailSendService;
    @Test
    void mail(){

            mailSendService.sendSimpleMail("1365904133@qq.com", "subject", "content");

    }
}
