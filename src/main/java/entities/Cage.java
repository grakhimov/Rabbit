package entities;

import javax.persistence.*;

@Entity
@Table(name = "cages")
public class Cage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "posX")
    private int posX;
    @Column(name = "posY")
    private int posY;
    @Column(name = "entity`")
    private Object entity;

    public Cage(String s, String s1) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public Cage() {
    }

    @Override
    public String toString() {
        return "Cage{" +
                "id=" + id +
                ", posX=" + posX +
                ", posY=" + posY +
                ", entity=" + entity +
                '}';
    }
}
