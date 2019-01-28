package ru.mirea.pets.lab1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class CartService {
    class CartObj{
        private int id;
        private Item item;

        public CartObj(int id, Item item) {
            this.id = id;
            this.item = item;
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CartObj cartObj = (CartObj) o;
            return id == cartObj.id &&
                    Objects.equals(item, cartObj.item);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, item);
        }
    }

    private List<Item> cart = new ArrayList<Item>();

    public void add(Item item){
        cart.add(item);
    }

    public void remove(Item item){
        cart.remove(item);
    }

    public List<Item> get(){
        return cart;
    }
    public void clearCart(){ cart.clear(); }


}
