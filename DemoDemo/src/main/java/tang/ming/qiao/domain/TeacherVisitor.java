package tang.ming.qiao.domain;

import java.util.Date;

public class TeacherVisitor {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_visitor.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_visitor.t_id
     *
     * @mbggenerated
     */
    private Long tId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_visitor.u_id
     *
     * @mbggenerated
     */
    private Long uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_visitor.visit_time
     *
     * @mbggenerated
     */
    private Date visitTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_visitor.id
     *
     * @return the value of teacher_visitor.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_visitor.id
     *
     * @param id the value for teacher_visitor.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_visitor.t_id
     *
     * @return the value of teacher_visitor.t_id
     *
     * @mbggenerated
     */
    public Long gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_visitor.t_id
     *
     * @param tId the value for teacher_visitor.t_id
     *
     * @mbggenerated
     */
    public void settId(Long tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_visitor.u_id
     *
     * @return the value of teacher_visitor.u_id
     *
     * @mbggenerated
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_visitor.u_id
     *
     * @param uId the value for teacher_visitor.u_id
     *
     * @mbggenerated
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_visitor.visit_time
     *
     * @return the value of teacher_visitor.visit_time
     *
     * @mbggenerated
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_visitor.visit_time
     *
     * @param visitTime the value for teacher_visitor.visit_time
     *
     * @mbggenerated
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }
}