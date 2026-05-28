package org.rikkei.session03.controller;

import lombok.AllArgsConstructor;
import org.rikkei.session03.dto.response.StudentDto;
import org.rikkei.session03.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getAllSinhVien(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }

}
