package tang.ming.qiao.domain;

import java.util.Date;

public class UserTrade {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_trade.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_trade.u_id
     *
     * @mbggenerated
     */
    private Long uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_trade.trade_type
     *
     * @mbggenerated
     */
    private Byte tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_trade.amount
     *
     * @mbggenerated
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_trade.trade_time
     *
     * @mbggenerated
     */
    private Date tradeTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_trade.id
     *
     * @return the value of user_trade.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_trade.id
     *
     * @param id the value for user_trade.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_trade.u_id
     *
     * @return the value of user_trade.u_id
     *
     * @mbggenerated
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_trade.u_id
     *
     * @param uId the value for user_trade.u_id
     *
     * @mbggenerated
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_trade.trade_type
     *
     * @return the value of user_trade.trade_type
     *
     * @mbggenerated
     */
    public Byte getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_trade.trade_type
     *
     * @param tradeType the value for user_trade.trade_type
     *
     * @mbggenerated
     */
    public void setTradeType(Byte tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_trade.amount
     *
     * @return the value of user_trade.amount
     *
     * @mbggenerated
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_trade.amount
     *
     * @param amount the value for user_trade.amount
     *
     * @mbggenerated
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_trade.trade_time
     *
     * @return the value of user_trade.trade_time
     *
     * @mbggenerated
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_trade.trade_time
     *
     * @param tradeTime the value for user_trade.trade_time
     *
     * @mbggenerated
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }
}