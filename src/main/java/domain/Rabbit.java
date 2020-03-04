package domain;

import support.Sex;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "rabbits")
public class Rabbit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "birthday")
    private LocalDateTime birthday;
    @Column(name = "sex")
    private Sex sex;
    @Column(name = "vaccines")
    @OneToMany(cascade = {CascadeType.ALL})
    @ElementCollection(targetClass=Vaccine.class)
    private List<Vaccine> vaccines;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
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
