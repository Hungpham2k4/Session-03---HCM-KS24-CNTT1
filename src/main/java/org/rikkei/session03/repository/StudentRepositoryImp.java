package org.rikkei.session03.repository;

import org.rikkei.session03.dto.response.StudentDto;
import org.rikkei.session03.entity.Student;
import org.rikkei.session03.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImp implements StudentRepository {

    private final List<Student> students;

    public StudentRepositoryImp() {
        students = new ArrayList<>();

        students.add(new Student("SV1", "Pham Van A", 10.0));
        students.add(new Student("SV2", "Nguyen Van B", 7.5));
        students.add(new Student("SV3", "Tran Thi C", 4.3));
    }

    @Override
    public List<StudentDto> getAll() {
        return StudentMapper.toDto(students);
    }
}