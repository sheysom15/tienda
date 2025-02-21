

package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Somarriba
 */
@Controller
public class indexController {

    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
   @RequestMapping("/informacion")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "contacto";
    }
}
