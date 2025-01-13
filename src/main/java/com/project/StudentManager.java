package com.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    // Thêm sinh viên
    public void addStudent(Student student) {
        students.add(student);
    }

    // Xóa sinh viên theo ID
    public boolean removeStudentById(String id) {
        return students.removeIf(student -> student.getId().equals(id));
    }

    // Tìm kiếm sinh viên theo ID
    public Student findStudentById(String id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Tìm kiếm sinh viên theo tên
    public List<Student> findStudentsByName(String name) {
        return students.stream()
                .filter(student -> student.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Sắp xếp theo điểm trung bình
    public List<Student> sortStudentsByGpaDescending() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    // Lấy danh sách sinh viên có điểm trung bình lớn hơn giá trị cho trước
    public List<Student> getStudentsWithGpaAbove(double gpaThreshold) {
        return students.stream()
                .filter(student -> student.getGpa() > gpaThreshold)
                .collect(Collectors.toList());
    }

    // Tính điểm trung bình chung
    public double calculateAverageGpa() {
        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }
}

