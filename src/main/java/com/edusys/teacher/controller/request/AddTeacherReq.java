package com.edusys.teacher.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddTeacherReq {

    private String firstName;

    private String lastName;

}
