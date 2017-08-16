package tang.ming.qiao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tang.ming.qiao.domain.OrderLine;
import tang.ming.qiao.domain.OrderLineExample;

public interface OrderLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int countByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int deleteByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int insert(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int insertSelective(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    List<OrderLine> selectByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    OrderLine selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OrderLine record, @Param("example") OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OrderLine record, @Param("example") OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderLine record);
}