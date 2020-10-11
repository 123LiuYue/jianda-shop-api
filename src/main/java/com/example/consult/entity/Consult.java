package com.example.consult.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author liuyue
 * @date 2020/10/9 16:16
 * 咨询实体
 */
public class Consult {

    /**
     * 咨询主键
     */
    private String consultId;
    /**
     * 图片
     */
    private String consultImg;
    /**
     * 内容
     */
    private String journalism;
    /**
     * 时间
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date time;
    /**
     * 浏览次数
     */
    private String browse;

    public String getConsultId() {
        return consultId;
    }

    public void setConsultId(String consultId) {
        this.consultId = consultId;
    }

    public String getConsultImg() {
        return consultImg;
    }

    public void setConsultImg(String consultImg) {
        this.consultImg = consultImg;
    }

    public String getJournalism() {
        return journalism;
    }

    public void setJournalism(String journalism) {
        this.journalism = journalism;
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
}
