package com.crimsonlogic.groceriessubbookingsystem.controller;

import com.crimsonlogic.groceriessubbookingsystem.entity.OrderDetails;
import com.crimsonlogic.groceriessubbookingsystem.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/order-details")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping
    public String getAllOrderDetails(Model model) {
        List<OrderDetails> orderDetailsList = orderDetailsService.getAllOrderDetails();
        model.addAttribute("orderDetailsList", orderDetailsList);
        return "order-details";
    }

    @GetMapping("/add")
    public String showAddOrderDetailsForm(Model model) {
        model.addAttribute("orderDetails", new OrderDetails());
        return "add-order-details";
    }

    @PostMapping("/add")
    public String addOrderDetails(@ModelAttribute OrderDetails orderDetails, Model model) {
        orderDetailsService.saveOrderDetails(orderDetails);
        return "redirect:/order-details";
    }

    @GetMapping("/{id}")
    public String getOrderDetailsById(@PathVariable String id, Model model) {
        Optional<OrderDetails> orderDetails = orderDetailsService.getOrderDetailsById(id);
        if (orderDetails.isPresent()) {
            model.addAttribute("orderDetails", orderDetails.get());
            return "order-details-view";
        } else {
            model.addAttribute("error", "Order details not found");
            return "error";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteOrderDetails(@PathVariable String id) {
        orderDetailsService.deleteOrderDetails(id);
        return "redirect:/order-details";
    }
}
