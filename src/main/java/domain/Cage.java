package domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cages")
public class Cage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "pos_x")
    private int posX;
    @Column(name = "pos_y")
    private int posY;
    @Column(name = "entity")
    private int entity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
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
