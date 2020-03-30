package com.edusys.teacher.adapter.repository;

import com.edusys.teacher.domain.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
