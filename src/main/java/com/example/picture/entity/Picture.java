package com.example.picture.entity;

/**
 * @author liuyue
 * @date 2020/9/28 14:49
 * 图片实体
 */
public class Picture {
    /**
     * 图片id
     */
    private String pictureId;
    /**
     * 图片地址
     */
    private  String pictureSite;

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureSite() {
        return pictureSite;
    }

    public void setPictureSite(String pictureSite) {
        this.pictureSite = pictureSite;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "pictureId='" + pictureId + '\'' +
                ", pictureSite='" + pictureSite + '\'' +
                '}';
    }
}
