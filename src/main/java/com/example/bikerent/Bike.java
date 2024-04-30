package com.example.bikerent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {

    @Id
    private Long id;
    private String model;
    private String serialNo;
    private double price;
    private double dayPrice;
    private String borrowerId;

    public Bike() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Bike(Long id, String model, String serialNo, double price, double dayPrice) {
        this.id = id;
        this.model = model;
        this.serialNo = serialNo;
        this.price = price;
        this.dayPrice = dayPrice;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", price=" + price +
                ", dayPrice=" + dayPrice +
                ", borrowerId='" + borrowerId + '\'' +
                '}';
    }
}
