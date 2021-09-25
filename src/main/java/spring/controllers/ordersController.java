//package spring.controllers;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import database.*;
//
//@RestController
//@RequestMapping("/orders")
//class ordersController {
//    HibernateRequest hibernateRequest = new HibernateRequest();
//
//
//    @GetMapping("/{id}")
//    public orders getOrdersByID(@PathVariable long id) {
//        orders result = hibernateRequest.getOrdersByID(id);
//        return result;
//    }
//
//}
