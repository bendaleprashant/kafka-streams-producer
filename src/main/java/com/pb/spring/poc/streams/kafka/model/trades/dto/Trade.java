package com.pb.spring.poc.streams.kafka.model.trades.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Trade {
    private String tradeId;
    private String stockName;
}
