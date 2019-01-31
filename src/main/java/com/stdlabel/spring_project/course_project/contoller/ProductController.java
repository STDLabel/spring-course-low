package com.stdlabel.spring_project.course_project.contoller;


import com.stdlabel.spring_project.course_project.model.ProductModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "product")
public class ProductController {

    private List<ProductModel> products;

    @GetMapping
    public String showProductForm(Model model) {

        model.addAttribute("product", new ProductModel());
        return "/product/product_form";
    }

    @PostMapping("new")
    public String addProduct(@ModelAttribute("product") ProductModel productModel) {
        if(products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productModel);
        return "redirect:/product/list";
    }


    @GetMapping("list")
    public String listProduct(Model model) {
        if (products == null || products.size() == 0) {
            products = new ArrayList<>();
            ProductModel productModel = new ProductModel();
            productModel.setName("Test");
            productModel.setPrice(123);
            products.add(productModel);
        }
        model.addAttribute("products", products);
        return "/product/product_list";
    }
}
