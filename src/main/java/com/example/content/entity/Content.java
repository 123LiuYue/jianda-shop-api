package com.example.content.entity;

/**
 * @author liuyue
 * @date 2020/10/8 10:02
 * 内容实体
 */
public class Content {

    /**
     * 内容id
     */
    private String contentId;
    /**
     * 内容图片
     */
    private String img;
    /**
     * 内容
     */
    private String content;
    /**
     * 标题id外键
     */
    private String titleId;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }
}
