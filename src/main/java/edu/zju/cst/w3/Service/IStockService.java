package edu.zju.cst.w3.Service;

import java.util.Date;
import java.util.List;

/**
 * @作者 Mr.Hu
 * @时间 2018/10/8
 * @描述
 */
public interface IStockService {
    double getStockClosingPrice(String stockId, Date date);

    void insertStockClosingPrice(String stockId,Date date,Double closingPrice);

    String getStockName(String id);

    List<String> getStockIdList();

    String getBestStock(Date startDate,Date endDate);
}
