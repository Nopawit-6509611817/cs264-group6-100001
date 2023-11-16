package th.ac.tu.cs.project.services.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import th.ac.tu.cs.project.services.model.Request;

import java.util.Collections;
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
    public int updateAdvisor1(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET advisorApprove1='approve' WHERE studentID=?",
                new Object[] { studentID });
    }
@Override
    public int updateAdvisor2(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET advisorApprove2='approve' WHERE studentID=?",
                new Object[] { studentID });
    }
@Override
    public int updateTeacher1(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET teacherApprove1='approve' WHERE studentID=?",
                new Object[] { studentID });
    }
@Override
    public int updateTeacher2(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET teacherApprove2='approve' WHERE studentID=?",
                new Object[] { studentID });
    }

   @Override
    public int refuseAdvisor1(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET advisorApprove1='refuse' WHERE studentID=?",
                new Object[] { studentID });
    }
@Override
    public int refuseAdvisor2(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET advisorApprove2='refuse' WHERE studentID=?",
                new Object[] { studentID });
    }
@Override
    public int refuseTeacher1(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET teacherApprove1='refuse' WHERE studentID=?",
                new Object[] { studentID });
    }
@Override
    public int refuseTeacher2(long studentID) {

        return jdbcTemplate.update("UPDATE request1 SET teacherApprove2='refuse' WHERE studentID=?",
                new Object[] { studentID });
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
             return  jdbcTemplate.query("SELECT * FROM request1 where (teacher1=? AND teacherApprove1='waiting') OR (advisor=? AND advisorApprove1='waiting') OR (advisor=? AND advisorApprove2='waiting')OR (teacher2=? AND teacherApprove2='waiting');", BeanPropertyRowMapper.newInstance(Request.class), teacherName, teacherName, teacherName, teacherName);
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

    @Override
    public List<Request> findRequestsByEmptyTeacherApprove() {
        try {
            return jdbcTemplate.query("SELECT * FROM request1 WHERE teacherApprove1 IS NULL OR teacherApprove2 IS NULL",
                    BeanPropertyRowMapper.newInstance(Request.class));
        } catch (IncorrectResultSizeDataAccessException e) {
            return Collections.emptyList(); // Or handle the exception as needed
        }
    }

   
}

