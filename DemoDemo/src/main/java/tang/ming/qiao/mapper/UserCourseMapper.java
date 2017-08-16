package tang.ming.qiao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tang.ming.qiao.domain.UserCourse;
import tang.ming.qiao.domain.UserCourseExample;

public interface UserCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int countByExample(UserCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int deleteByExample(UserCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int insert(UserCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int insertSelective(UserCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    List<UserCourse> selectByExample(UserCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    UserCourse selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserCourse record);
}