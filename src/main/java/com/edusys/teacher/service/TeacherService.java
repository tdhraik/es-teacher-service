package com.edusys.teacher.service;

import com.edusys.teacher.controller.request.AddTeacherReq;

public interface TeacherService {

    void addTeacher(Long schoolId, AddTeacherReq addTeacherReq);
}
