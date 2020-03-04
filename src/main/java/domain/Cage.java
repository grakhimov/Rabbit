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
    private int pos_x;
    @Column(name = "pos_y")
    private int pos_y;
    @Column(name = "entity")
    private int entity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
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
                ", posX=" + pos_x +
                ", posY=" + pos_y +
                ", entity=" + entity +
                '}';
    }
}
