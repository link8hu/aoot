import edu.zju.cst.w3.Dao.imp.StockDAO;
import edu.zju.cst.w3.Service.imp.StockService;
import edu.zju.cst.w3.pojo.Stock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/** 
* StockService Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 8, 2018</pre> 
* @version 1.0 
*/ 
public class StockServiceTest {
    private SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    private StockDAO stockDAO=new StockDAO();
    private StockService stockService=new StockService();
@Before
public void before() throws Exception {
    List<Stock> testList =new ArrayList<Stock>();
    Stock stock1 =new Stock("100000","hxs",99.99,format.parse("2018-09-01"));
    Stock stock2 =new Stock("100000","hxs",101,format.parse("2018-09-02"));
    Stock stock3 =new Stock("100001","lhy",98,format.parse("2018-09-01"));
    Stock stock4 =new Stock("100001","lhy",99,format.parse("2018-09-02"));
    testList.add(stock1);
    testList.add(stock2);
    testList.add(stock3);
    testList.add(stock4);
    stockDAO.setStocklist(testList);
    stockService.setStockDAO(stockDAO);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getStockClosingPrice(String stockId, Date date) 
* 
*/ 
@Test
public void testGetStockClosingPrice() throws Exception { 
double testPrice =stockService.getStockClosingPrice("100000",format.parse("2018-09-01"));
System.out.println(testPrice);

} 

/** 
* 
* Method: insertStockClosingPrice(String stockId, Date date, Double closingPrice) 
* 
*/ 
@Test
public void testInsertStockClosingPrice() throws Exception { 
stockService.insertStockClosingPrice("100003",format.parse("2018-09-01"),50.0);
} 

/** 
* 
* Method: getStockName(String id) 
* 
*/ 
@Test
public void testGetStockName() throws Exception { 
String name=stockService.getStockName("100000");
    System.out.println(name);

} 

/** 
* 
* Method: getStockIdList() 
* 
*/ 
@Test
public void testGetStockIdList() throws Exception {
    List<String> testString =stockService.getStockIdList();

} 

/** 
* 
* Method: getBestStock(Date startDate, Date endDate) 
* 
*/ 
@Test
public void testGetBestStock() throws Exception { 
String bestNam =stockService.getBestStock(format.parse("2018-09-01"),format.parse("2018-09-02"));
System.out.println(bestNam);
} 


} 
