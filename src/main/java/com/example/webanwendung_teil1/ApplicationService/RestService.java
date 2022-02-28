package com.example.webanwendung_teil1.ApplicationService;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.coinbase.v2.CoinbaseExchange;
import org.knowm.xchange.coinbase.v2.dto.CoinbasePrice;
import org.knowm.xchange.coinbase.v2.service.CoinbaseMarketDataService;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.coinbase.v2.dto.marketdata.CoinbasePriceData;
import org.knowm.xchange.service.marketdata.params.CurrencyPairsParam;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class RestService {

    public String getBTC_EURPrice() throws IOException {

        Exchange coinbase = ExchangeFactory.INSTANCE.createExchange(CoinbaseExchange.class);
        CoinbaseMarketDataService marketDataService =
                (CoinbaseMarketDataService) coinbase.getMarketDataService();
        CoinbasePrice buyPrice = marketDataService.getCoinbaseBuyPrice(Currency.BTC, Currency.EUR);
        return buyPrice.toString();
    }
    public String getETH_EURPrice() throws IOException {
        Exchange coinbase = ExchangeFactory.INSTANCE.createExchange(CoinbaseExchange.class);
        CoinbaseMarketDataService marketDataService =
                (CoinbaseMarketDataService) coinbase.getMarketDataService();
        CoinbasePrice buyPrice = marketDataService.getCoinbaseBuyPrice(Currency.ETH, Currency.EUR);
        return buyPrice.toString();
    }

}
