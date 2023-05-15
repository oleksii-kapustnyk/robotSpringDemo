package com.ua.robot.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {

    private Long id;
    private String name;
    private int age;
    private String address;
    private String groupName;
}
