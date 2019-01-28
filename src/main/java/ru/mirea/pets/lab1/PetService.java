package ru.mirea.pets.lab1;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private List<Pet> petsDB = new ArrayList<Pet>();

    @PostConstruct
    public void init(){

        petsDB.add(new Pet("labrador","dog",10,1));
        petsDB.add(new Pet("terrier", "dog", 10, 2));
        petsDB.add(new Pet("scotland","cat", 9,3));
    }

    public Pet getPet(int id){
        return petsDB.get(id);
    }

    public List<Pet> getPets(){
        return petsDB;
    }

    public void buyPet(int id){ petsDB.remove(id); }

}
