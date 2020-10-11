package com.example.detailTake.entity;

/**
 * @author liuyue
 * @date 2020/10/10 15:09
 * 商品详情轮播图片实体
 */
public class DetailTake {
    /**
     * 商品详情轮播图片实体
     */
    private String detailsTakeId;
    /**
     * 轮播图片
     */
    private String img1;
    /**
     * 外键id
     */
    private String commodityId;

    public String getDetailsTakeId() {
        return detailsTakeId;
    }

    public void setDetailsTakeId(String detailsTakeId) {
        this.detailsTakeId = detailsTakeId;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }
}
