package th.ac.tu.cs.project.services.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import th.ac.tu.cs.project.services.model.Request;

import java.util.List;

@Repository
public class JdbcRequestRepository implements  RequestRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Request request) {
        return jdbcTemplate.update("INSERT INTO request1 (studentID, studentFirstName, studentLastName, studentYear, " +
        "studentBranch, date, advisor, subjectCode1, subjectName1, section1, dayTime1, teacher1, " +
        "type1, teacherApprove1, advisorApprove1, subjectCode2, subjectName2, section2, dayTime2, teacher2, type2, teacherApprove2, advisorApprove2, cause1, cause2) " +
        "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
        new Object[] { request.getStudentID(), request.getStudentFirstName(), request.getStudentLastName(), request.getStudentYear(),
        request.getStudentBranch(),request.getDate() ,request.getAdvisor(), request.getSubjectCode1(), request.getSubjectName1(), 
        request.getSection1(), request.getDayTime1(), request.getTeacher1(), request.getType1(), request.getTeacherApprove1(), request.getAdvisorApprove1(), request.getSubjectCode2(), request.getSubjectName2(), 
        request.getSection2(), request.getDayTime2(), request.getTeacher2(), request.getType2(), request.getTeacherApprove2(), request.getAdvisorApprove2(), request.getCause1(), request.getCause2() });
    
    }

    @Override
    public int update(Request request) {

        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Request findByStudentId(long studentID) {

        try {
             return  jdbcTemplate.queryForObject("SELECT * From request1 Where studentId=?;", BeanPropertyRowMapper.newInstance(Request.class), studentID);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

       public List<Request> findByStudentIdForteacher(String teacherName) {

        try {
             return  jdbcTemplate.query("SELECT * FROM request1 where teacher1=? OR advisor=? OR teacher2=?;", BeanPropertyRowMapper.newInstance(Request.class), teacherName, teacherName, teacherName);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int deleteByStudentId(long studentID) {
  
        throw new UnsupportedOperationException("Unimplemented method 'deleteByStudentId'");
    }

    @Override
    public List<Request> findAll() {
 
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public int deleteAll() {

        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }



   
}

