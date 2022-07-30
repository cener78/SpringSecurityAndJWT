package com.springsecurityandjwt.springsecurityandjwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(path="v/studentsx")
    public String getStudent(String student){
        return "Kursat Ak";
    }

}
