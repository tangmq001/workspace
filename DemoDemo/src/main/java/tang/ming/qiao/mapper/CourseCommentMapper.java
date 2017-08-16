package tang.ming.qiao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tang.ming.qiao.domain.CourseComment;
import tang.ming.qiao.domain.CourseCommentExample;

public interface CourseCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int countByExample(CourseCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int deleteByExample(CourseCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int insert(CourseComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int insertSelective(CourseComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    List<CourseComment> selectByExample(CourseCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    CourseComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CourseComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CourseComment record);
}