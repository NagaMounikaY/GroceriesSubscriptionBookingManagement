package com.crimsonlogic.groceriessubbookingsystem.controller;

import com.crimsonlogic.groceriessubbookingsystem.entity.Order;
import com.crimsonlogic.groceriessubbookingsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/add")
    public String showAddOrderForm(Model model) {
        // Prepare any data needed for the form, e.g., users, subscriptions, etc.
        // model.addAttribute("users", userService.getAllUsers());
        // model.addAttribute("subscriptions", subscriptionService.getAllSubscriptions());
        model.addAttribute("order", new Order());
        return "add-order";
    }

    @PostMapping("/add")
    public String addOrder(Order order, Model model) {
        orderService.saveOrder(order);
        model.addAttribute("message", "Order added successfully");
        return "redirect:/orders/list"; // Redirect to the list page after successful addition
    }

    @GetMapping("/list")
    public String listOrders(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "list-orders";
    }

    @PostMapping("/update-status")
    public String updateOrderStatus(@RequestParam("order_id") String orderId,
                                    @RequestParam("status") Order.OrderStatus status,
                                    Model model) {
        orderService.updateOrderStatus(orderId, status);
        model.addAttribute("message", "Order status updated successfully");
        return "redirect:/orders/list"; // Redirect to the list page after successful update
    }

    @GetMapping("/details")
    public String orderDetails(@RequestParam("order_id") String orderId, Model model) {
        Order order = orderService.getOrderById(orderId);
        if (order != null) {
            model.addAttribute("order", order);
        } else {
            model.addAttribute("message", "Order not found");
        }
        return "order-details";
    }
}
