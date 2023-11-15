package th.ac.tu.cs.project.services.repository;



import java.util.List;

import th.ac.tu.cs.project.services.model.Request;

public interface RequestRepository {
    int save(Request request);

    int update(Request request);

    Request findByStudentId(long studentID);

    List<Request> findByStudentIdForteacher(String teacherName);


    int deleteByStudentId(long studentID);

    List<th.ac.tu.cs.project.services.model.Request> findAll();

    int deleteAll();
}
