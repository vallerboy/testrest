package sample;

import javafx.fxml.Initializable;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    public void initialize(URL location, ResourceBundle resources) {
        RestTemplate restTemplate = new RestTemplate();
    }
}
