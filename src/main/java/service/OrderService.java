package service;

import component.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

    @Service
    public class OrderService {

        Cart cart = new Cart();

        public OrderService(Cart cart) {
            this.cart = cart;
        }

        public void addToCart (List<Integer> idsToAdd) {
            cart.addToCart(idsToAdd);
        }


        public List<Integer> getItems  () {
            return cart.getCartContent();
        }
    }

