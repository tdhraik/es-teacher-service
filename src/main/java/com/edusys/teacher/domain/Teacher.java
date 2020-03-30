package com.edusys.teacher.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_generator")
    @SequenceGenerator(name="teacher_generator", sequenceName = "teacher_seq", allocationSize = 1)
    private Long id;

    private Long schoolId;

    private String firstName;

    private String lastName;
}
