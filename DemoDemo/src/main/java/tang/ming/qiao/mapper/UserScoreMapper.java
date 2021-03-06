package tang.ming.qiao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tang.ming.qiao.domain.UserScore;
import tang.ming.qiao.domain.UserScoreExample;

public interface UserScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int countByExample(UserScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int deleteByExample(UserScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int insert(UserScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int insertSelective(UserScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    List<UserScore> selectByExample(UserScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    UserScore selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserScore record, @Param("example") UserScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserScore record, @Param("example") UserScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_score
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserScore record);
}