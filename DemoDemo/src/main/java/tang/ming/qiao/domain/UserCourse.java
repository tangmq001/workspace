package tang.ming.qiao.domain;

import java.util.Date;

public class UserCourse {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_course.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_course.c_id
     *
     * @mbggenerated
     */
    private Long cId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_course.u_id
     *
     * @mbggenerated
     */
    private Long uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_course.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_course.id
     *
     * @return the value of user_course.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_course.id
     *
     * @param id the value for user_course.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_course.c_id
     *
     * @return the value of user_course.c_id
     *
     * @mbggenerated
     */
    public Long getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_course.c_id
     *
     * @param cId the value for user_course.c_id
     *
     * @mbggenerated
     */
    public void setcId(Long cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_course.u_id
     *
     * @return the value of user_course.u_id
     *
     * @mbggenerated
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_course.u_id
     *
     * @param uId the value for user_course.u_id
     *
     * @mbggenerated
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_course.create_time
     *
     * @return the value of user_course.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_course.create_time
     *
     * @param createTime the value for user_course.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}