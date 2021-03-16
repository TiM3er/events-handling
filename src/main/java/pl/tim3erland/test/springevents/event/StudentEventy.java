package pl.tim3erland.test.springevents.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationEvent;

/**
 * @author: Piotr Witowski
 * @date: 15.03.2021
 * Day of week: poniedziałek
 */
@Data
public class StudentEventy<StudentDto> extends ApplicationEvent {
    private StudentDto studentDto;
    private String name;

    public StudentEventy(Object source) {
        super(source);
    }

    public StudentEventy(Object source, StudentDto studentDto) {
        super(source);
        this.studentDto = studentDto;
    }

    public StudentEventy(Object source, StudentDto studentDto, String name) {
        super(source);
        this.name = name;
        this.studentDto = studentDto;
    }
}
