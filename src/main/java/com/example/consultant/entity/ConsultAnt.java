package com.example.consultant.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author liuyue
 * @date 2020/10/9 18:14
 * 咨询详情实体
 */
public class ConsultAnt {
    /**
     * 咨询详情id
     */
    private String consultantId;
    /**
     * 标题
     */
    private String headline;
    /**
     * 发表时间
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date time;
    /**
     * 浏览次数
     */
    private String browse;
    /**
     * 内容
     */
    private String details;
    /**
     * 咨询id外键
     */
    private String consultId;

    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBrowse() {
        return browse;
    }

    public void setBrowse(String browse) {
        this.browse = browse;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getConsultId() {
        return consultId;
    }

    public void setConsultId(String consultId) {
        this.consultId = consultId;
    }
}
