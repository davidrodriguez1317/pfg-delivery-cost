package com.dro.pfg.pfgdeliverycost.service;

import com.dro.pfg.pfgdeliverycost.config.AppProperties;
import com.dro.pfg.pfgdeliverycost.model.dto.DeliveryCostDto;
import com.dro.pfg.pfgdeliverycost.model.entity.PriceEntity;
import com.dro.pfg.pfgdeliverycost.repository.DeliveryCostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class DeliveryCostService {


    private final DeliveryCostRepository deliveryCostRepository;

    private final AppProperties appProperties;

    public DeliveryCostDto getProductById(String currency, String id) {

        String defaultCurrency = appProperties.getDefaultCurrency();
        log.info("Default currency: {}", defaultCurrency);

        PriceEntity priceEntity = deliveryCostRepository.getPriceByIdAndCurrency(defaultCurrency, id);
        log.info("Price from db for product with id {} and currency {}: {}", id, currency, priceEntity);

        return DeliveryCostDto.builder()
                .id(id)
                .currency(currency)
                .deliveryCost(priceEntity.getPrice())
                .build();
    }
}
