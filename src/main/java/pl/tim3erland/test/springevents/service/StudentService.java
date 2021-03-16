package pl.tim3erland.test.springevents.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import pl.tim3erland.test.springevents.dto.StudentDto;
import pl.tim3erland.test.springevents.event.StudentEventy;

/**
 * @author: Piotr Witowski
 * @date: 15.03.2021
 * Day of week: poniedziałek
 */
@Slf4j
@Service
public class StudentService {


    private final ApplicationEventPublisher applicationEventPublisher;

    public StudentService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void addNewStudent(StudentDto studentDto) {
        log.info("Send event do listener");
        applicationEventPublisher.publishEvent(new StudentEventy<StudentDto>(studentDto, studentDto));
        applicationEventPublisher.publishEvent(new StudentEventy<StudentDto>(studentDto, studentDto, "test"));
    }
}
