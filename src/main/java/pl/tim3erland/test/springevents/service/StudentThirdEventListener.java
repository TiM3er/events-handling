package pl.tim3erland.test.springevents.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.tim3erland.test.springevents.event.StudentEventy;

/**
 * @author: Piotr Witowski
 * @date: 15.03.2021
 * Day of week: poniedziałek
 */
@Slf4j
@Service
public class StudentThirdEventListener {

    @EventListener(condition = "#studentEventy.name != null ")
    public void studentHandler(StudentEventy studentEventy) {
        log.info("srudent third listener: {} with name: {} ", studentEventy.getStudentDto(), studentEventy.getName());
    }
}
