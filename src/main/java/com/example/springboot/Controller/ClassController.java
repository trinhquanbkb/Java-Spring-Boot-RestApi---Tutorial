package com.example.springboot.Controller;

import com.example.springboot.Payload.Request.ClassRequest;
import com.example.springboot.Payload.Request.ClassUpdateRequest;
import com.example.springboot.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/v1/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping(path = "/get-list-class")
    public ResponseEntity<Object> getAllListClass(){
            return ResponseEntity.ok(classService.getAllClass());
    }

    @PostMapping(path = "/create")
    public String createClass(@RequestBody ClassRequest classRequest){
        try{
            classService.addClass(classRequest);
            return "Success add class";
        }
        catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping(path = "/get-class-by-id")
    public ResponseEntity<Object> getClassById(@RequestBody int id){
        return ResponseEntity.ok(classService.getClassById(id));
    }

    @DeleteMapping(path = "/delete")
    public String deleteClassById(@RequestBody int id){
        try{
            classService.deleteClassById(id);
            return "Success delete";
        }
        catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @PutMapping(path = "/update")
    public String updateClass(@RequestBody ClassUpdateRequest classUpdateRequest){
        try{
            classService.updateClass(classUpdateRequest);
            return "Success update";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
