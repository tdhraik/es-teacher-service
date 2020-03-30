package com.edusys.teacher.controller.mapper;

import com.edusys.teacher.controller.request.AddTeacherReq;
import com.edusys.teacher.domain.Teacher;

public class TeacherMapper {

    public static Teacher mapToTeacher(Long schoolId, AddTeacherReq addTeacherReq) {
        Teacher teacher = new Teacher();
        teacher.setSchoolId(schoolId);
        teacher.setFirstName(addTeacherReq.getFirstName());
        teacher.setLastName(addTeacherReq.getLastName());
        return teacher;
    }
}
