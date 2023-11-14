package th.ac.tu.cs.project.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.tu.cs.project.services.model.Request;
import th.ac.tu.cs.project.services.repository.RequestRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class RequestController {
    @Autowired
    RequestRepository requestRepository;

        @PostMapping("/request")
    public ResponseEntity<String> createStudent(@RequestBody Request request) {
        try {
            requestRepository.save(new Request(request.getStudentID(), request.getStudentFirstName(), request.getStudentLastName(), request.getStudentYear(),
            request.getStudentBranch(), request.getAdvisor(), request.getSubjectCode1(), request.getSubjectName1(), 
            request.getSection1(), request.getDayTime1(), request.getTeacher1(), request.getType1(), request.getTeacherApprove1(), request.getAdvisorApprove1(), request.getSubjectCode2(), request.getSubjectName2(), 
            request.getSection2(), request.getDayTime2(), request.getTeacher2(), request.getType2(), request.getTeacherApprove2(), request.getAdvisorApprove2(), request.getCause1(), request.getCause2()));
            return new ResponseEntity<>("Student was created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}
