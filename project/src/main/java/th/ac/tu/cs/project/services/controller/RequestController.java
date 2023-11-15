package th.ac.tu.cs.project.services.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import th.ac.tu.cs.project.services.model.Request;
import th.ac.tu.cs.project.services.repository.RequestRepository;
import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class RequestController {
    @Autowired
    RequestRepository requestRepository;

    @PostMapping("/request0000")
    public ResponseEntity<String> createRequest(@RequestBody Request request) {
        try {
            requestRepository.save(new Request(request.getStudentID(), request.getStudentFirstName(), request.getStudentLastName(), request.getStudentYear(),
            request.getStudentBranch(),request.getDate() ,request.getAdvisor(), request.getSubjectCode1(), request.getSubjectName1(), 
            request.getSection1(), request.getDayTime1(), request.getTeacher1(), request.getType1(), request.getTeacherApprove1(), request.getAdvisorApprove1(), request.getSubjectCode2(), request.getSubjectName2(), 
            request.getSection2(), request.getDayTime2(), request.getTeacher2(), request.getType2(), request.getTeacherApprove2(), request.getAdvisorApprove2(), request.getCause1(), request.getCause2()));
            return new ResponseEntity<>("Student was created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
        }
    }

        @GetMapping("/search/{studentId}")
    public ResponseEntity<Request> getStudentById(@PathVariable("studentId") long studentID) {

        Request request = requestRepository.findByStudentId(studentID);

        if (request != null) {
            return new ResponseEntity<>(request, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

        @GetMapping("/search/teacher/{studentId}")
    public ResponseEntity<List<Request>> getStudentByIdForTeacher(@PathVariable("studentId") String teacherName) {
        try{
        List<Request> requests = new ArrayList<Request>();
        requestRepository.findByStudentIdForteacher(teacherName).forEach(requests::add);



        if (requests.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(requests, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    }


    
}
