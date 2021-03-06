package tang.ming.qiao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tang.ming.qiao.domain.UserTrade;
import tang.ming.qiao.domain.UserTradeExample;

public interface UserTradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int countByExample(UserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int deleteByExample(UserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int insert(UserTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int insertSelective(UserTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    List<UserTrade> selectByExample(UserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    UserTrade selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserTrade record, @Param("example") UserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserTrade record, @Param("example") UserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserTrade record);
}