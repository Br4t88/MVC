package controllers;

import model.Buyer;
import model.Product;
import model.Sales;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class BuyersController {

    @GetMapping("/hello")
    public ModelAndView modelAndView() throws SQLException, ClassNotFoundException {
        ModelAndView mv = new ModelAndView();
        mv.addObject("buyer", new Buyer());
        mv.addObject("product", new Product());
        mv.addObject("sales", new Sales());
        mv.setViewName("hello");
        return mv;
    }

    @PostMapping("/hello")
    public ModelAndView mv(@ModelAttribute("buyer") Buyer buyer) throws ClassNotFoundException, SQLException {

        buyer.insert();




        return modelAndView();
    }

    @PostMapping("/hello01")
    public ModelAndView mv1(@ModelAttribute("buyer") Buyer buyer) throws ClassNotFoundException, SQLException {

        buyer.update();



        return modelAndView();
    }
    @PostMapping("/hello02")
    public ModelAndView mv2(@ModelAttribute("buyer") Buyer buyer) throws ClassNotFoundException, SQLException {

        buyer.delete();



        return modelAndView();
    }


}
