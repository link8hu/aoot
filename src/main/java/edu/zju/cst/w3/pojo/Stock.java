package edu.zju.cst.w3.pojo;

import java.util.Date;

/**
 * @���� Mr.Hu
 * @ʱ�� 2018/10/8
 * @����
 */
public class Stock {
    private String id;  //��Ʊ����

    private String name;// ��Ʊ����

    private double closingPrice;  //��Ʊ���̼�

    private Date date;// ����

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
