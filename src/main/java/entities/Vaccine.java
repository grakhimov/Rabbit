package entities;

import support.VaccineType;

public class Vaccine {
    private VaccineType vaccineType;
    private Number quantity;

    public VaccineType getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(VaccineType vaccineType) {
        this.vaccineType = vaccineType;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Vaccine() {
    }
}
