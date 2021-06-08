package org.shancm.maildemo.service;

import javax.mail.MessagingException;

/**
 * @Classname MailSendService
 * @Description TODO
 * @Date 2021/6/8 10:56
 * @Created by S.cm
 */
public interface MailSendService {

    void sendSimpleMail(String to, String subject, String content);

    void sendTemplateMail(String to, String subject) throws MessagingException;
}
