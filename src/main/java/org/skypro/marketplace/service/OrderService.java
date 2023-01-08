package org.skypro.marketplace.service;

import org.skypro.marketplace.component.Cart;
import org.springframework.stereotype.Service;

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

