package com.project.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Parameter;

@Controller
public class projectController {

    @CrossOrigin
    @PostMapping("add")
        public ResponseEntity<projectResult> add(@RequestBody project parameter){
        projectResult project=new projectResult();
        project.result=parameter.a + parameter.b;
        project.a = parameter.a;
        project.b=parameter.b;
        
        return  new ResponseEntity<>(project, HttpStatus.OK);
        

}    @CrossOrigin
    @PostMapping("multi")
    public ResponseEntity<projectResult> mul(@RequestBody project parameter){
        projectResult project=new projectResult();
        project.result= parameter.a * parameter.b;
        project.a = parameter.a;
        project.b=parameter.b;

        return  new ResponseEntity<>(project, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("sub")
    public ResponseEntity<projectResult> sub(@RequestBody project parameter){
        projectResult project=new projectResult();
        project.result=   parameter.a - parameter.b;
        project.a = parameter.a;
        project.b=parameter.b;

        return  new ResponseEntity<>(project, HttpStatus.OK);


    }
    @CrossOrigin
    @PostMapping("div")
    public ResponseEntity<projectResult> div(@RequestBody project parameter){
        projectResult project=new projectResult();
        project.result=   parameter.a / parameter.b;
        project.a = parameter.a;
        project.b=parameter.b;

        return  new ResponseEntity<>(project, HttpStatus.OK);


    }
    @CrossOrigin
    @PostMapping("mod")
    public ResponseEntity<projectResult> mod(@RequestBody project parameter){
        projectResult project=new projectResult();
        project.result=   parameter.a % parameter.b;
        project.a = parameter.a;
        project.b=parameter.b;

        return  new ResponseEntity<>(project, HttpStatus.OK);


    }



}
