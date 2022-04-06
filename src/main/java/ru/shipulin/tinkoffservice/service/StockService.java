package ru.shipulin.tinkoffservice.service;

import ru.shipulin.tinkoffservice.dto.FigiesDto;
import ru.shipulin.tinkoffservice.dto.StockPricesDto;
import ru.shipulin.tinkoffservice.dto.StocksDto;
import ru.shipulin.tinkoffservice.dto.TickersDto;
import ru.shipulin.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);

    StocksDto getStocksByTickers(TickersDto tickers);

    StockPricesDto getPrices(FigiesDto figiesDto);

}
