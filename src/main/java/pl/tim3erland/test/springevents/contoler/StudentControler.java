package pl.tim3erland.test.springevents.contoler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.tim3erland.test.springevents.dto.StudentDto;
import pl.tim3erland.test.springevents.service.StudentService;

/**
 * @author: Piotr Witowski
 * @date: 15.03.2021
 * Day of week: poniedziałek
 */
@Slf4j
@RestController
public class StudentControler {

    private final StudentService studentService;

    @Autowired
    public StudentControler(StudentService studentService) {
        this.studentService = studentService;
    }


    @PutMapping("/student")
    public ResponseEntity<Void> addNewStudent(@RequestBody StudentDto studentDto) {
        log.info("Start add new student for event process");
        studentService.addNewStudent(studentDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
