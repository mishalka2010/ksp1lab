package ru.mirea.pets.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private StuffService stuffService;
    @Autowired
    private PetService petService;


    @RequestMapping(path = "cart", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> handleCart(){
        return cartService.get();
    }

    @RequestMapping(path = "cart/pet/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void handleAddPet(@PathVariable int id){
        cartService.add(petService.getPet(id));
    }

    @RequestMapping(path = "cart/stuff/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void handleAddStuff(@PathVariable int id){
        cartService.add(stuffService.getOne(id));
    }

    @RequestMapping(path = "cart/pet/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void handleDelPet(@PathVariable int id){
        cartService.remove(petService.getPet(id));
    }

    @RequestMapping(path = "cart/stuff/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void handleDelStuff(@PathVariable int id){
        cartService.remove(stuffService.getOne(id));
    }


    @RequestMapping(path = "cart", method = RequestMethod.DELETE)
    @ResponseBody
    public void handleClear(){
        cartService.clearCart();
    }

    @RequestMapping(path = "cart/balance/currency", method = RequestMethod.POST)
    @ResponseBody
    public void buy(){
        cartService.clearCart();
    }
}

