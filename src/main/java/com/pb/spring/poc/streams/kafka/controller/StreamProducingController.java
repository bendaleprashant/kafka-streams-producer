package com.pb.spring.poc.streams.kafka.controller;

import com.pb.spring.poc.streams.kafka.model.trades.dto.Trade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StreamProducingController {

    private final MessageChannel output;

    @PostMapping("/publish")
    public Trade publishEvent(@RequestBody Trade trade) {
        log.info("Received Trade " + trade);
        output.send(MessageBuilder.withPayload(trade).build());
        return trade;
    }
}
