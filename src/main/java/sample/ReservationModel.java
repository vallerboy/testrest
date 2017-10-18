package sample;

import java.time.LocalDate;


public class ReservationModel {
     private int id;
     private String name;
     private String lastname;
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
