package edu.zju.cst.w3.Dao.imp;

import edu.zju.cst.w3.Dao.IStockDAO;
import edu.zju.cst.w3.pojo.Stock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @作者 Mr.Hu
 * @时间 2018/10/8
 * @描述
 */
public class StockDAO implements IStockDAO {
    private  List <Stock> stocklist =new ArrayList<Stock>();

    public void setStocklist(List<Stock> stocklist) {
        this.stocklist = stocklist;
    }

    public double getStockClosingPrice(String stockId, Date date) {
        int j=stocklist.size();
        for(int i=0;i<j;i++){
            Stock s = stocklist.get(i);
            if(s.getId().equals(stockId) && s.getDate().equals(date) ){
                return s.getClosingPrice();
            }
        }
        return 0;
    }

    public void insertStockClosingPrice(String stockId, Date date, Double closingPrice) {
        int j=stocklist.size();
        for(int i=0;i<j;i++){
            Stock s = stocklist.get(i);
            if(s.getId()==stockId && s.getDate()== date){
                s.setClosingPrice(closingPrice);
                stocklist.set(i,s);
            }
        }
    }

    public String getStockName(String stockId) {
        int j=stocklist.size();
        for(int i=0;i<j;i++){
            Stock s = stocklist.get(i);
            if(s.getId()==stockId ){
                return s.getName();
            }
        }
        return null;
    }

    public List<String> getStockIdList() {
        List<String> stockIdList =new ArrayList<String>();
        int j=stocklist.size();
        for(int i=0;i<j;i++){
            Stock s = stocklist.get(i);
            stockIdList.add(s.getId());
        }
        return stockIdList;
    }
}
