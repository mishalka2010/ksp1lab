package ru.mirea.pets.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StuffController {

    @Autowired
    private StuffService stuffService;

    @RequestMapping(path = "stuff", method = RequestMethod.GET)
    @ResponseBody
    public List<Stuff> handleStuff(){
        return stuffService.getStuff();
    }

    @RequestMapping(path = "stuff/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Stuff handleGetOne(@PathVariable int id){
        return stuffService.getOne(id);
    }


}
