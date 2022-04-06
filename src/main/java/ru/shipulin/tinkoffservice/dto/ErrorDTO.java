package ru.shipulin.tinkoffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ErrorDTO {
    private String error;
}
