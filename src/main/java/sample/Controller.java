package sample;

import com.sun.javafx.fxml.expression.Expression;
import javafx.fxml.Initializable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Controller implements Initializable{


    public void initialize(URL location, ResourceBundle resources) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Password-App","akademiapremium" );
        HttpEntity<String> entity = new HttpEntity(httpHeaders);

        ResponseEntity<List<ReservationModel>> s = restTemplate.exchange(
                "http://localhost:8080/rest/reservation",
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<ReservationModel>>() {
                });

        System.out.println(s.getBody().stream()
                .map(b -> b.toString())
                .collect(Collectors.joining("\n")));
    }
}
