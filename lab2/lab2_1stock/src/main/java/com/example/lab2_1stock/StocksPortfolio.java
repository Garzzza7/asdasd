package com.example.lab2_1stock;

import java.util.ArrayList;
import java.util.List;

public class StocksPortfolio {
    private List<Stock> stocks = new ArrayList<>();
    private IStockmarketService stockmarket;
    StocksPortfolio(IStockmarketService ss){
        stockmarket=ss;
    }
    void addStock(Stock stock){
        stocks.add(stock);
    }
    double getTotalValue(){
        double sum=0;
        for(int i =0 ; i<stocks.size();i++){
            sum+=stockmarket.lookUpPrice(stocks.get(i).getLabel());
        }
        return sum;
    }

}
