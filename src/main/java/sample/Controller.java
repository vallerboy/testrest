package sample;

import javafx.fxml.Initializable;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    public void initialize(URL location, ResourceBundle resources) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Password-App","akademiapremium" );
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity("parameters", httpHeaders);

       ResponseEntity<String> s = restTemplate.exchange(
                        "http://localhost:8080/rest/reservation", HttpMethod.GET, entity, String.class);
        System.out.println(s.toString());
    }
}
