package org.rikkei.session03.repository;

import org.rikkei.session03.dto.response.StudentDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {
    List<StudentDto> getAll();
}
