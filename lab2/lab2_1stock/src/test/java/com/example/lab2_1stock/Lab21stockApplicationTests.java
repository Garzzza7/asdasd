package com.example.lab2_1stock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT) //it makes mockinto not throw when we create something and then not use it OVERALL IT IS A BAD PRACTICE
class Lab21stockApplicationTests {

	@Mock
	//IStockmarketService stockmarketService = mock(IStockmarketService.class);
	IStockmarketService market;
	@InjectMocks
	StocksPortfolio portfolio;

	@Test
	void getTotalValueAnnot(){

		when(market.lookUpPrice("EBAY")).thenReturn(4.0);
		when(market.lookUpPrice("MSFT")).thenReturn(1.5);
		//when(market.lookUpPrice("NOTUSED")).thenReturn(1.5);
		portfolio.addStock(new Stock("EBAY",2));
		portfolio.addStock(new Stock("MSFT",4));
		double total=portfolio.getTotalValue();
		assertEquals(14.0,total);
		//verify(portfolio.getTotalValue());
		verify(market,times(2)).lookUpPrice(anyString());

	}


}
