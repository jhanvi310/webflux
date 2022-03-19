package DataController;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import service.DataService;
 
@RestController
@RequestMapping("/json")
public class Controller {

	    @Autowired
	    private DataService data;
	    @PostMapping(value = { "/create", "/" })
	    @ResponseStatus(HttpStatus.CREATED)
	    public Mono<Data> create(@RequestBody Data d) {
	        
			return data.create(d);
	    }
	    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	    @ResponseStatus(HttpStatus.OK)
	    public Flux<Data> findAll() {
	    	return data.findAll();
	    }
}
