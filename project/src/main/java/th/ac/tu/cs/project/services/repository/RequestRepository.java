package th.ac.tu.cs.project.services.repository;



import java.util.List;

import th.ac.tu.cs.project.services.model.Request;

public interface RequestRepository {
    int save(Request request);

    int updateAdvisor1(long studentID);

    int updateAdvisor2(long studentID);

    int updateTeacher1(long studentID);

    int updateTeacher2(long studentID);
    
    int refuseAdvisor1(long studentID);

    int refuseAdvisor2(long studentID);

    int refuseTeacher1(long studentID);

    int refuseTeacher2(long studentID);

    Request findByStudentId(long studentID);

    List<Request> findByStudentIdForteacher(String teacherName);

    List<Request> findRequestsByEmptyTeacherApprove();


    int deleteByStudentId(long studentID);

    List<th.ac.tu.cs.project.services.model.Request> findAll();

    int deleteAll();
}
