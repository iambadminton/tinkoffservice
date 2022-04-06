package ru.shipulin.tinkoffservice.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Stock {
    String ticker;
    String figi;
    String name;
    String type;
    Currency currency;
    String source;
}
