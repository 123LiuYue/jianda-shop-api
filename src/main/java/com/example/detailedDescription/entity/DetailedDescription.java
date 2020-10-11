package com.example.detailedDescription.entity;

/**
 * @author liuyue
 * @date 2020/10/10 16:35
 * 商品详情内容实体
 */
public class DetailedDescription {
    /**
     * 商品详情内容id
     */
    private String detailedDescriptionId;
    /**
     * 价格
     */
    private String price;
    /**
     * 过去价格
     */
    private String formerPrice;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 编号
     */
    private String number;
    /**
     * 库存
     */
    private String inventory;
    /**
     * 规格参数
     */
    private String parameter;

    /**
     * 商品列表id外键
     */
    private String commodityId;


    public String getDetailedDescriptionId() {
        return detailedDescriptionId;
    }

    public void setDetailedDescriptionId(String detailedDescriptionId) {
        this.detailedDescriptionId = detailedDescriptionId;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }
}
