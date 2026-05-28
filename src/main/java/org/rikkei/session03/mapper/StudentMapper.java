package org.rikkei.session03.mapper;
import lombok.NoArgsConstructor;
import org.rikkei.session03.dto.response.StudentDto;
import org.rikkei.session03.entity.Student;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class StudentMapper {
    public static List<StudentDto> toDto(List<Student> student){
        List<StudentDto> studentDtos = new ArrayList<>();
        for(Student s: student){
            studentDtos.add(new StudentDto(s.getMaSV(),s.getHoTen(),s.getDiemTB()));
        }
        return studentDtos;
    }
}
