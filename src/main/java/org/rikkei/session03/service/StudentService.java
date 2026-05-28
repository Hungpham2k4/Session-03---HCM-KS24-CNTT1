package org.rikkei.session03.service;

import org.rikkei.session03.dto.response.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<StudentDto> getAllStudent();
}
