package com.example.lab2_1stock;

import java.util.ArrayList;
import java.util.List;

public class StocksPortfolio {
    private List<Stock> stocks;
    private IStockmarketService stockmarket;
    public StocksPortfolio(IStockmarketService ss){
        stockmarket=ss;
        stocks = new ArrayList<>();
    }
    public void addStock(Stock stock){
        stocks.add(stock);
    }
    public double getTotalValue(){
        double sum=0;
        for( Stock stock: stocks ){
            sum += stock.getQuantity() * stockmarket.lookUpPrice( stock.getLabel() );
        }
        //Switching to range based loop due to the fact that java is weird
        /*
        for(int i =0 ; i<stocks.size();i++){
           // sum+=stockmarket.lookUpPrice(stocks.get(i).getLabel());
            sum+=stocks.get(i);
        }
         */
        return sum;
    }

}
