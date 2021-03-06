package springcloud.client.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @program: HEQING_client
 * @description:
 * @author: hezy
 * @create: 2019-03-11 16:33
 **/
public class UserRedPacket {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_RED_PACKET.id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_RED_PACKET.red_packet_id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    private Integer redPacketId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_RED_PACKET.user_id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_RED_PACKET.amount
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_RED_PACKET.grad_time
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    private Date gradTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_RED_PACKET.note
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_RED_PACKET.red_packet
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    private Integer redPacket;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.id
     *
     * @return the value of T_USER_RED_PACKET.id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_RED_PACKET.id
     *
     * @param id the value for T_USER_RED_PACKET.id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.red_packet_id
     *
     * @return the value of T_USER_RED_PACKET.red_packet_id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public Integer getRedPacketId() {
        return redPacketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_RED_PACKET.red_packet_id
     *
     * @param redPacketId the value for T_USER_RED_PACKET.red_packet_id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public void setRedPacketId(Integer redPacketId) {
        this.redPacketId = redPacketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.user_id
     *
     * @return the value of T_USER_RED_PACKET.user_id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_RED_PACKET.user_id
     *
     * @param userId the value for T_USER_RED_PACKET.user_id
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.amount
     *
     * @return the value of T_USER_RED_PACKET.amount
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
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
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
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
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
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
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
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
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
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
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_RED_PACKET.red_packet
     *
     * @return the value of T_USER_RED_PACKET.red_packet
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public Integer getRedPacket() {
        return redPacket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_RED_PACKET.red_packet
     *
     * @param redPacket the value for T_USER_RED_PACKET.red_packet
     *
     * @mbggenerated Thu Mar 07 14:50:15 CST 2019
     */
    public void setRedPacket(Integer redPacket) {
        this.redPacket = redPacket;
    }
}