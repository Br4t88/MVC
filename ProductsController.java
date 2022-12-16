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
public class ProductsController {

    @GetMapping("/hello1")
    public ModelAndView modelAndView() throws SQLException, ClassNotFoundException {
        ModelAndView mv = new ModelAndView();
        mv.addObject("product", new Product());
        mv.addObject("buyer", new Buyer());
        mv.addObject("sales", new Sales());
        mv.setViewName("hello");
        return mv;
    }

    @PostMapping("/hello1")
    public ModelAndView mv(@ModelAttribute("product") Product product) throws ClassNotFoundException, SQLException {

        product.insert();


        return modelAndView();
    }

    @PostMapping("/hello11")
    public ModelAndView mv1(@ModelAttribute("product") Product product) throws ClassNotFoundException, SQLException {

        product.update();


        return modelAndView();
    }

    @PostMapping("/hello12")
    public ModelAndView mv2(@ModelAttribute("product") Product product) throws ClassNotFoundException, SQLException {

        product.delete();


        return modelAndView();
    }
}
