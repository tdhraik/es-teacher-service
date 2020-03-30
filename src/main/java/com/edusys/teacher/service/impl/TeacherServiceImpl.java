package com.edusys.teacher.service.impl;

import com.edusys.teacher.adapter.repository.TeacherRepository;
import com.edusys.teacher.controller.mapper.TeacherMapper;
import com.edusys.teacher.controller.request.AddTeacherReq;
import com.edusys.teacher.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void addTeacher(Long schoolId, AddTeacherReq addTeacherReq) {
        teacherRepository.save(TeacherMapper.mapToTeacher(schoolId, addTeacherReq));
    }
}
