package com.edusys.teacher.controller;

import com.edusys.teacher.controller.request.AddTeacherReq;
import com.edusys.teacher.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/school/{schoolId}/teacher")
@Api(value = "/school/{schoolId}/teacher", description = "Teacher registration", tags = "teacher-service")
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    @ApiOperation(value = "Add teacher")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "BAD_REQUEST")
    })
    public void addTeacher(@PathVariable Long schoolId,
                           @RequestBody AddTeacherReq addTeacherReq) {
        teacherService.addTeacher(schoolId, addTeacherReq);
    }
}
