package vn.titv.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.titv.spring.demo.dao.StudentDAO;
import vn.titv.spring.demo.entity.StudentEntity;
import vn.titv.spring.demo.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public List<StudentEntity> findAllStudents() {
        List<StudentEntity> students = studentService.getAllStudent();

        return students;
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> findById(@PathVariable Long id) {
        Optional<StudentEntity> student = studentService.getById(id);

        return student;
    }

    @PostMapping("")
    public ResponseEntity<StudentEntity> addAStudent(@RequestBody StudentEntity student) {
        studentService.saveAStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentEntity> updateAStudent(@RequestBody StudentEntity student, @PathVariable Long id) {
        Optional<StudentEntity> existingStudent = studentService.getById(id);
        if (existingStudent.isPresent()) {
            studentService.saveAStudent(student);
            return ResponseEntity.ok(student);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAStudent(@PathVariable Long id) {
        Optional<StudentEntity> existingStudent = studentService.getById(id);
        if (existingStudent.isPresent()) {
            studentService.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
