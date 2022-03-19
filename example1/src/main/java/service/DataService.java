package service;
import java.time.Duration;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DataService{
		@Autowired
		WebClient webClient;
		
		
	

	public Flux<Data> findAll() {
		return webClient.get()
				.uri("/json")
				.retrieve()
				.bodyToFlux(Data.class)
				.timeout(Duration.ofMillis(10_000));
	}


	public Mono<Data> create(Data data)
	{
		return webClient.post()
				.uri("/json")
				.body(Mono.just(data), Data.class)
				.retrieve()
				.bodyToMono(Data.class)
				.timeout(Duration.ofMillis(10_000));
	}


	
}
