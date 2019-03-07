package springcloud.client.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserRedPacket {

    private Integer id;

    private Integer redPacketId;

    private Integer userId;

    private BigDecimal amount;

    private Date gradTime;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Integer redPacketId) {
        this.redPacketId = redPacketId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.amount
     *
     * @return the value of T_USER_RED_PACKET.amount
     *
     * @mbggenerated Wed Mar 06 14:33:57 CST 2019
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_RED_PACKET.amount
     *
     * @param amount the value for T_USER_RED_PACKET.amount
     *
     * @mbggenerated Wed Mar 06 14:33:57 CST 2019
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.grad_time
     *
     * @return the value of T_USER_RED_PACKET.grad_time
     *
     * @mbggenerated Wed Mar 06 14:33:57 CST 2019
     */
    public Date getGradTime() {
        return gradTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_RED_PACKET.grad_time
     *
     * @param gradTime the value for T_USER_RED_PACKET.grad_time
     *
     * @mbggenerated Wed Mar 06 14:33:57 CST 2019
     */
    public void setGradTime(Date gradTime) {
        this.gradTime = gradTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.note
     *
     * @return the value of T_USER_RED_PACKET.note
     *
     * @mbggenerated Wed Mar 06 14:33:57 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_RED_PACKET.note
     *
     * @param note the value for T_USER_RED_PACKET.note
     *
     * @mbggenerated Wed Mar 06 14:33:57 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}