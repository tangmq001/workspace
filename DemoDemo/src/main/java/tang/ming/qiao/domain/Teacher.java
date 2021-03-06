package tang.ming.qiao.domain;

import java.util.Date;

public class Teacher {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_name
     *
     * @mbggenerated
     */
    private String tName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.school
     *
     * @mbggenerated
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.course
     *
     * @mbggenerated
     */
    private String course;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.tech_date
     *
     * @mbggenerated
     */
    private Date techDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.big_icon
     *
     * @mbggenerated
     */
    private String bigIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.mid_icon
     *
     * @mbggenerated
     */
    private String midIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.small_icon
     *
     * @mbggenerated
     */
    private String smallIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_name
     *
     * @return the value of teacher.t_name
     *
     * @mbggenerated
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_name
     *
     * @param tName the value for teacher.t_name
     *
     * @mbggenerated
     */
    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.school
     *
     * @return the value of teacher.school
     *
     * @mbggenerated
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.school
     *
     * @param school the value for teacher.school
     *
     * @mbggenerated
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.course
     *
     * @return the value of teacher.course
     *
     * @mbggenerated
     */
    public String getCourse() {
        return course;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.course
     *
     * @param course the value for teacher.course
     *
     * @mbggenerated
     */
    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.create_time
     *
     * @return the value of teacher.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.create_time
     *
     * @param createTime the value for teacher.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.tech_date
     *
     * @return the value of teacher.tech_date
     *
     * @mbggenerated
     */
    public Date getTechDate() {
        return techDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.tech_date
     *
     * @param techDate the value for teacher.tech_date
     *
     * @mbggenerated
     */
    public void setTechDate(Date techDate) {
        this.techDate = techDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.big_icon
     *
     * @return the value of teacher.big_icon
     *
     * @mbggenerated
     */
    public String getBigIcon() {
        return bigIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.big_icon
     *
     * @param bigIcon the value for teacher.big_icon
     *
     * @mbggenerated
     */
    public void setBigIcon(String bigIcon) {
        this.bigIcon = bigIcon == null ? null : bigIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.mid_icon
     *
     * @return the value of teacher.mid_icon
     *
     * @mbggenerated
     */
    public String getMidIcon() {
        return midIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.mid_icon
     *
     * @param midIcon the value for teacher.mid_icon
     *
     * @mbggenerated
     */
    public void setMidIcon(String midIcon) {
        this.midIcon = midIcon == null ? null : midIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.small_icon
     *
     * @return the value of teacher.small_icon
     *
     * @mbggenerated
     */
    public String getSmallIcon() {
        return smallIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.small_icon
     *
     * @param smallIcon the value for teacher.small_icon
     *
     * @mbggenerated
     */
    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon == null ? null : smallIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.description
     *
     * @return the value of teacher.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.description
     *
     * @param description the value for teacher.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}