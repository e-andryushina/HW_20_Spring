package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.List;


@RestController
@RequestMapping( "/store/order")

public class OrderContoller {
    private final OrderService orderService;

    public OrderContoller(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addToCart(@RequestParam("id") List<Integer> idsToAdd) {
        orderService.addToCart(idsToAdd);
    }


    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }

}