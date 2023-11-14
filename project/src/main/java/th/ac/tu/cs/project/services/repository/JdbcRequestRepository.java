package th.ac.tu.cs.project.services.repository;

import org.apache.coyote.Request;

import java.util.List;

public interface JdbcRequestRepository {
    int save(Request request);

    int update(Request request);

    Request findByStudentId(long studentID);

    int deleteByStudentId(long studentID);

    List<Request> findAll();

    int deleteAll();
}
