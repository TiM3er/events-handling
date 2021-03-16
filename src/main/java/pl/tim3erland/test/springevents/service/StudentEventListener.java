package pl.tim3erland.test.springevents.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import pl.tim3erland.test.springevents.event.StudentEventy;

/**
 * @author: Piotr Witowski
 * @date: 15.03.2021
 * Day of week: poniedziałek
 */
@Slf4j
@Service
public class StudentEventListener  implements ApplicationListener<StudentEventy> {


    @Override
    public void onApplicationEvent(StudentEventy studentEventy) {
        log.info("Student first listener: {} with name: {}",studentEventy.getStudentDto(),studentEventy.getName());
    }
}
