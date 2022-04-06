package ru.shipulin.tinkoffservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.shipulin.tinkoffservice.dto.FigiesDto;
import ru.shipulin.tinkoffservice.dto.StockPricesDto;
import ru.shipulin.tinkoffservice.dto.StocksDto;
import ru.shipulin.tinkoffservice.dto.TickersDto;
import ru.shipulin.tinkoffservice.model.Stock;
import ru.shipulin.tinkoffservice.service.StockService;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/stock/{ticker}")
    public Stock getStOCK(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickersDto) {
        return stockService.getStocksByTickers(tickersDto);
    }

    @PostMapping("/prices")
    public StockPricesDto getPrices(@RequestBody FigiesDto figiesDto) {
        return stockService.getPrices(figiesDto);
    }

}
