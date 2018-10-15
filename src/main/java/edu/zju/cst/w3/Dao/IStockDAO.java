package edu.zju.cst.w3.Dao;

import java.util.Date;
import java.util.List;

/**
 * @���� Mr.Hu
 * @ʱ�� 2018/10/8
 * @����
 */
public interface IStockDAO {

    double getStockClosingPrice(String stockId, Date date);

    void insertStockClosingPrice(String stockId, Date date,Double closingPrice);

    String getStockName(String stockId);

    List<String> getStockIdList();
}
