package edu.zju.cst.w3.Service.imp;

import edu.zju.cst.w3.Dao.imp.StockDAO;
import edu.zju.cst.w3.Service.IStockService;

import java.util.Date;
import java.util.List;

/**
 * @作者 Mr.Hu
 * @时间 2018/10/8
 * @描述
 */
public class StockService implements IStockService {
    private StockDAO stockDAO;

    public void setStockDAO(StockDAO stockDAO) {
        this.stockDAO = stockDAO;
    }

    public double getStockClosingPrice(String stockId, Date date) {
        return stockDAO.getStockClosingPrice(stockId ,date);
    }

    public void insertStockClosingPrice(String stockId, Date date, Double closingPrice) {
        stockDAO.insertStockClosingPrice(stockId,date,closingPrice);
    }

    public String getStockName(String id) {
        return stockDAO.getStockName(id);
    }

    public List<String> getStockIdList() {
        return stockDAO.getStockIdList();
    }

    public String getBestStock(Date startDate, Date endDate) {
        List <String> stockId =getStockIdList();
        int j=stockId.size();
        double max=getStockClosingPrice(stockId.get(0),startDate) - getStockClosingPrice(stockId.get(0),endDate);
        String id,maxId=stockId.get(0);
        for (int i = 1; i <j ; i++) {
            id=stockId.get(i);
            if (getStockClosingPrice(id,startDate) - getStockClosingPrice(id,endDate) >max){
                max= getStockClosingPrice(id,startDate) - getStockClosingPrice(id,endDate);
                maxId =id;
            }
        }
        return maxId;
    }
}
