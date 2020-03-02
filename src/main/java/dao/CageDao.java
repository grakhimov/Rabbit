package dao;

import entities.Cage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CageDao implements Dao<Cage> {

    private List<Cage> cages = new ArrayList<>();

    @Override
    public Optional<Cage> get(long id) {
        return Optional.ofNullable(cages.get((int) id));
    }

    @Override
    public List<Cage> getAll() {
        return cages;
    }

    @Override
    public void save(Cage cage) {
        cages.add(cage);
    }

    @Override
    public void update(Cage cage, String[] params) {
        cage.setPosX(Integer.parseInt(params[0]));
        cage.setPosY(Integer.parseInt(params[1]));
        cage.setEntity(params[2]);
        cages.add(cage);
    }

    @Override
    public void delete(Cage cage) {
        cages.remove(cage);
    }
}
