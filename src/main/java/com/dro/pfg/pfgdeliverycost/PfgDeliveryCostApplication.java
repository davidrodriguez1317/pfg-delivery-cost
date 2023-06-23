package com.dro.pfg.pfgdeliverycost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
public class PfgDeliveryCostApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PfgDeliveryCostApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }
}
