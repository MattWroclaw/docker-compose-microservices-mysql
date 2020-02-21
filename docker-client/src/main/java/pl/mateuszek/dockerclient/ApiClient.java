package pl.mateuszek.dockerclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiClient {


    @GetMapping("/showForGUI")
    public Animal[] getAnimals(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Animal[]> exchange = restTemplate.exchange("http://api:10101/animals",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Animal[].class);
        Animal[] body = exchange.getBody();
        return body;
    }


}
