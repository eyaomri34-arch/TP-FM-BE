package com.eyaomri.TP_FM_BE.service;

import com.eyaomri.TP_FM_BE.Entity.Student;
import com.eyaomri.TP_FM_BE.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> update(Long id, Student newData) {
        return studentRepository.findById(id).map(student -> {
            student.setName(newData.getName());
            student.setLevel(newData.getLevel());
            return studentRepository.save(student);
        });
    }

    public boolean delete(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}