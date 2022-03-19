package service;
import javax.xml.crypto.Data;

import reactor.core.publisher.Flux;

public interface DataServiceImpl {
	Flux<Data> findAll();
}
