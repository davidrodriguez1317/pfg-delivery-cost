package com.dro.pfg.pfgdeliverycost.controller;

import com.dro.pfg.pfgdeliverycost.model.dto.DeliveryCostDto;
import com.dro.pfg.pfgdeliverycost.service.DeliveryCostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
@RequiredArgsConstructor
@Slf4j
public class DeliveryCostController {

    private final DeliveryCostService deliveryCostService;

    @GetMapping("/{currency}/{id}")
    public DeliveryCostDto getDeliveryCost(@PathVariable(value="currency") String currency, @PathVariable(value="id") String id) {

        log.info("Getting deliveryCostDto for product with id {} and currency {}", id, currency);
        DeliveryCostDto deliveryCost = deliveryCostService.getProductById(currency, id);

        log.info("Delivery cost for product with id {} and currency {}: {}", id, currency, deliveryCost);
        return deliveryCost;
    }

}
