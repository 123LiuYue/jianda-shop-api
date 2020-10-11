package com.example.title.entity;

import com.example.content.entity.Content;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 9:35
 * 标题实体
 */
public class Title {
    /**
     * 标题id
     */
    private String titleId;
    /**
     * 标题名字
     */
    private  String titleName;
    /**
     * 内容id外键
     */
    private String contentId;
    /**
     * 一对多
     */
    private List<Content> contentList;

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }
}
