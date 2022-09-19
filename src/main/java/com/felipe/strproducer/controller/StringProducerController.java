package com.felipe.strproducer.controller;

import com.felipe.strproducer.services.StringProduceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/producer")
public class StringProducerController {

    private final StringProduceService produceService;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
        produceService.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
