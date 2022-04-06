package ru.shipulin.tinkoffservice.dto;

import lombok.*;
import ru.shipulin.tinkoffservice.model.Stock;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StocksDto {
    List<Stock> stocks;
}
