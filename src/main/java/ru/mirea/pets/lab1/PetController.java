package ru.mirea.pets.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetService petService;


    @RequestMapping(value = "pet", method = RequestMethod.GET)
    @ResponseBody
    public List<Pet> handlePets(){
        return petService.getPets();
    }

    @RequestMapping(value = "pet/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Pet handlePet(@PathVariable int id){
        return petService.getPet(id);
    }

}
