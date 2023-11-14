package th.ac.tu.cs.project.services.repository;
import org.apache.coyote.Request;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class RequestRepository implements  JdbcRequestRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Request request) {
        return 0;
    
    }

    @Override
    public int update(Request request) {
        return 0;
    }

    @Override
    public Request findByStudentId(long studentID) {
        return null;
    }

    @Override
    public int deleteByStudentId(long studentID) {
        return 0;
    }

    @Override
    public List<Request> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}

