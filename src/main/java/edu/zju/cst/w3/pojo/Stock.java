package edu.zju.cst.w3.pojo;

import java.util.Date;

/**
 * @作者 Mr.Hu
 * @时间 2018/10/8
 * @描述
 */
public class Stock {
    private String id;  //股票代码

    private String name;// 股票名称

    private double closingPrice;  //股票收盘价

    private Date date;// 日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public Stock(String id, String name, double closingPrice, Date date) {
        this.id = id;
        this.name = name;
        this.closingPrice = closingPrice;
        this.date = date;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
