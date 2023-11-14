package th.ac.tu.cs.project.services.model;

public class request {
    private long studentID;
    private String studentFirstName;
    private String studentLastName;
    private int studentYear;
    private String studentBranch;
    private String date;
    private String advisor;
    private String subjectCode1;
    private String subjectName1;
    private String section1;
    private String dayTime1;
    private String teacher1;
    private String type1;
    private String advisorApprove1;
    private String teacherApprove1;
    private String subjectCode2;
    private String subjectName2;
    private String section2;
    private String dayTime2;
    private String teacher2;
    private String type2;
    private String advisorApprove2;
    private String teacherApprove2;


    public request(long studentID, String studentFirstName, String studentLastName, int studentYear,
                   String studentBranch, String date, String advisor, String subjectCode1, String subjectName1,
                   String section1, String dayTime1, String teacher1, String type1, String advisorApprove1,
                   String teacherApprove1, String subjectCode2, String subjectName2, String section2,
                   String dayTime2, String teacher2, String type2, String advisorApprove2, String teacherApprove2) {
        this.studentID = studentID;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentYear = studentYear;
        this.studentBranch = studentBranch;
        this.date = date;
        this.advisor = advisor;
        this.subjectCode1 = subjectCode1;
        this.subjectName1 = subjectName1;
        this.section1 = section1;
        this.dayTime1 = dayTime1;
        this.teacher1 = teacher1;
        this.type1 = type1;
        this.advisorApprove1 = advisorApprove1;
        this.teacherApprove1 = teacherApprove1;
        this.subjectCode2 = subjectCode2;
        this.subjectName2 = subjectName2;
        this.section2 = section2;
        this.dayTime2 = dayTime2;
        this.teacher2 = teacher2;
        this.type2 = type2;
        this.advisorApprove2 = advisorApprove2;
        this.teacherApprove2 = teacherApprove2;
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getSubjectCode1() {
        return subjectCode1;
    }

    public void setSubjectCode1(String subjectCode1) {
        this.subjectCode1 = subjectCode1;
    }

    public String getSubjectName1() {
        return subjectName1;
    }

    public void setSubjectName1(String subjectName1) {
        this.subjectName1 = subjectName1;
    }

    public String getSection1() {
        return section1;
    }

    public void setSection1(String section1) {
        this.section1 = section1;
    }

    public String getDayTime1() {
        return dayTime1;
    }

    public void setDayTime1(String dayTime1) {
        this.dayTime1 = dayTime1;
    }

    public String getTeacher1() {
        return teacher1;
    }

    public void setTeacher1(String teacher1) {
        this.teacher1 = teacher1;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getAdvisorApprove1() {
        return advisorApprove1;
    }

    public void setAdvisorApprove1(String advisorApprove1) {
        this.advisorApprove1 = advisorApprove1;
    }

    public String getTeacherApprove1() {
        return teacherApprove1;
    }

    public void setTeacherApprove1(String teacherApprove1) {
        this.teacherApprove1 = teacherApprove1;
    }

    public String getSubjectCode2() {
        return subjectCode2;
    }

    public void setSubjectCode2(String subjectCode2) {
        this.subjectCode2 = subjectCode2;
    }

    public String getSubjectName2() {
        return subjectName2;
    }

    public void setSubjectName2(String subjectName2) {
        this.subjectName2 = subjectName2;
    }

    public String getSection2() {
        return section2;
    }

    public void setSection2(String section2) {
        this.section2 = section2;
    }

    public String getDayTime2() {
        return dayTime2;
    }

    public void setDayTime2(String dayTime2) {
        this.dayTime2 = dayTime2;
    }

    public String getTeacher2() {
        return teacher2;
    }

    public void setTeacher2(String teacher2) {
        this.teacher2 = teacher2;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getAdvisorApprove2() {
        return advisorApprove2;
    }

    public void setAdvisorApprove2(String advisorApprove2) {
        this.advisorApprove2 = advisorApprove2;
    }

    public String getTeacherApprove2() {
        return teacherApprove2;
    }

    public void setTeacherApprove2(String teacherApprove2) {
        this.teacherApprove2 = teacherApprove2;
    }


}
