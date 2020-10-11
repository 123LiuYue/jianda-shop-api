package com.example.commodity.entity;

/**
 * @author liuyue
 * @date 2020/10/7 10:16
 * 商品实体
 */
public class Commodity {
    /**
     * 商品Id
     */
    private String commodityId;
    /**
     * 商品图片
     */
    private String commodityImg;
    /**
     * 商品价格
     */
    private String price;
    /**
     * 商品过去价格
     */
    private String formerPrice;
    /**
     * 商品名称
     */
    private String commodityName;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityImg() {
        return commodityImg;
    }

    public void setCommodityImg(String commodityImg) {
        this.commodityImg = commodityImg;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFormerPrice() {
        return formerPrice;
    }

    public void setFormerPrice(String formerPrice) {
        this.formerPrice = formerPrice;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
