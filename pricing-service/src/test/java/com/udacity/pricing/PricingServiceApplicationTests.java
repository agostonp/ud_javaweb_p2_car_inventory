package com.udacity.pricing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PricingServiceApplicationTests {
    @LocalServerPort
    private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
    @Test
    public void getAllPrices() {
        ResponseEntity<String> response =
                  this.restTemplate.getForEntity("http://localhost:" + port + "/prices/", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void getPrice() {
        ResponseEntity<String> response =
                this.restTemplate.getForEntity("http://localhost:" + port + "/prices/3", String.class);
		System.out.println("############################# Response body:\n" + response.getBody());
		assertTrue(response.getBody().contains("\"currency\" : \"USD\","));
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

}
