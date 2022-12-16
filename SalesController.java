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
public class SalesController {

    @GetMapping("/hello2")
    public ModelAndView modelAndView() throws SQLException, ClassNotFoundException {
        ModelAndView mv = new ModelAndView();
        mv.addObject("sales", new Sales());
        mv.addObject("buyer", new Buyer());
        mv.addObject("product", new Product());
        mv.setViewName("hello");
        return mv;
    }

    @PostMapping("/hello2")
    public ModelAndView mv(@ModelAttribute("sales") Sales sales) throws ClassNotFoundException, SQLException {

        sales.update();

        return modelAndView();
    }
}
