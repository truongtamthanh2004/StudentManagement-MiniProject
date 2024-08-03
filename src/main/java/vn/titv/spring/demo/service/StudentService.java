package vn.titv.spring.demo.service;

import org.springframework.stereotype.Service;
import vn.titv.spring.demo.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    public List<StudentEntity> getAllStudent();
    public Optional<StudentEntity> getById(Long id);
    public StudentEntity saveAStudent(StudentEntity studentEntity);
    public void deleteById(Long id);
}
