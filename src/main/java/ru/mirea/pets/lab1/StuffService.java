package ru.mirea.pets.lab1;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class StuffService {
    private List<Stuff> stuffDB = new ArrayList<Stuff>();

    @PostConstruct
    public void init(){
        stuffDB.add(new Stuff("ball","toy",1,10));
        stuffDB.add(new Stuff("dry dog feed", "feed",2,50));
    }

    public Stuff getOne(int id){
        return stuffDB.get(id);
    }

    public List<Stuff> getStuff(){
        return stuffDB;
    }

    public void buyStuff(int id){ stuffDB.remove(id); }

}
