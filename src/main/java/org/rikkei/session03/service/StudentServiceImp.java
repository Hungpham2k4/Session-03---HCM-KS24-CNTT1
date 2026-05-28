package org.rikkei.session03.service;
import lombok.AllArgsConstructor;
import org.rikkei.session03.dto.response.StudentDto;
import org.rikkei.session03.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImp implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudent(){
        return studentRepository.getAll();
    }
}
