package vn.titv.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.titv.spring.demo.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface StudentDAO extends JpaRepository<StudentEntity, Long> {
//    @Override
//    public List<StudentEntity> findAll();
//
//    @Override
//    public Optional<StudentEntity> findById(Long id);
//
//    @Override
//    public StudentEntity save(StudentEntity student);
//
//    @Override
//    public void deleteById(Long id);
}
