package edu.zju.cst.w3.Dao;

import java.util.Date;
import java.util.List;

/**
 * @作者 Mr.Hu
 * @时间 2018/10/8
 * @描述
 */
public interface IStockDAO {

    double getStockClosingPrice(String stockId, Date date);

    void insertStockClosingPrice(String stockId, Date date,Double closingPrice);

    String getStockName(String stockId);

    List<String> getStockIdList();
}
