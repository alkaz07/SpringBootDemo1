package com.example.SpringBootDemo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller2 {
    @GetMapping("/hello")
    public String hello(String username     //параметр, который идет из строки запроса
                       , Model modelka     //словарь, в который можно добавлять аттрибуты для передачи в шаблон
    ){
        System.out.println("метод hello");
        System.out.println("username = " + username);
        modelka.addAttribute("x", username);    //поместим пару название_аттрибута-значение в словарь
        System.out.println("modelka = " + modelka);
        return "hello";         //название ШАБЛОНА
    }
}
