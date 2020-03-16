package org.acme.quickstart;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.net.URL;
import java.util.UUID;

//@QuarkusTest - instruct JUnit to start the application before the tests
@QuarkusTest
public class GreetingResourceTest {

	/*testing both rest endpoints*/
	
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }
    
    @Test
    public void testGreetingEndpoint() {
    	
    	//generate a random name
    	String uuid = UUID.randomUUID().toString();
    	
    	given()
    	.pathParam("name", uuid)
    	.then()
    		.statusCode(200)
    		.body(is("hello "+ uuid));
    	
    }
    
  

}