package vn.titv.spring.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.titv.spring.demo.dao.StudentDAO;
import vn.titv.spring.demo.entity.StudentEntity;
import vn.titv.spring.demo.service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentDAO.findAll();
    }

    @Override
    public Optional<StudentEntity> getById(Long id) {
        return studentDAO.findById(id);
    }

    @Override
    public StudentEntity saveAStudent(StudentEntity studentEntity) {
        return studentDAO.save(studentEntity);
    }

    @Override
    public void deleteById(Long id) {
        studentDAO.deleteById(id);
    }
}
