package entities;

import support.Sex;

import java.time.LocalDateTime;
import java.util.List;

public class Rabbit {
    private int id;
    private LocalDateTime birthdayDate;
    private Sex sex;
    private List<Vaccine> vaccines;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDateTime birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    public Rabbit() {
    }
}
