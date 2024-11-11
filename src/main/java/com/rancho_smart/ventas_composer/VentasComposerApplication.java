package com.rancho_smart.ventas_composer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VentasComposerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VentasComposerApplication.class, args);
	}

}
