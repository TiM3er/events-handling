package pl.tim3erland.test.springevents.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Piotr Witowski
 * @date: 15.03.2021
 * Day of week: poniedziałek
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String name;
    private String surname;
    private String adress;
    private String studentClass;
}
