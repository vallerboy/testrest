package sample;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import java.time.LocalDate;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class ReservationModel {
     private int id;
     private String name;
     private String lastname;
     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
     @JsonDeserialize(using = LocalDateDeserializer.class)
     private LocalDate date;
     private String adres;



     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getLastname() {
          return lastname;
     }

     public void setLastname(String lastname) {
          this.lastname = lastname;
     }

     public LocalDate getDate() {
          return date;
     }

     public void setDate(LocalDate date) {
          this.date = date;
     }

     public String getAdres() {
          return adres;
     }

     public void setAdres(String adres) {
          this.adres = adres;
     }

     @Override
     public String toString() {
          return "ReservationModel{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", lastname='" + lastname + '\'' +
                  ", date=" + date +
                  ", adres='" + adres + '\'' +
                  '}';
     }
}
