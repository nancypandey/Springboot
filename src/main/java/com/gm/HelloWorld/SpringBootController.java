package com.gm.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

	@Autowired
	DataService dataService;

	@PostMapping(path = "/add")
	public PostResponse Addition(@RequestBody PostRequest cust) {

		int a = cust.getA();
		int b = cust.getB();

		PostResponse postResponse = new PostResponse();

		PostResponse2 postResponse2 = new PostResponse2();

		postResponse2.setMultiply(a * b);

		postResponse2.setSquare(a * a);

		postResponse.setAddition(a + b);

		postResponse.setSubtract(a - b);

		postResponse.setQuotient(a / b);

		postResponse.setProduct(postResponse2);

		return postResponse;

	}
	
	@GetMapping(path = "/insert")
	public String insertInDB(@RequestBody PostRequest cust) {
		int a = cust.getA();
		int b = cust.getB();
		return dataService.insertData(a, b);
	}

}
