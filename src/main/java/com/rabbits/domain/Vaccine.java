package com.rabbits.domain;

import com.rabbits.support.VaccineType;

import javax.persistence.*;

@Entity
@Table(name = "vaccine")
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "vaccine_type")
    private VaccineType vaccine_type;
    @Column(name = "quantity")
    private Double quantity;

    public VaccineType getVaccine_type() {
        return vaccine_type;
    }

    public void setVaccine_type(VaccineType vaccine_type) {
        this.vaccine_type = vaccine_type;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vaccine() {
    }
}
