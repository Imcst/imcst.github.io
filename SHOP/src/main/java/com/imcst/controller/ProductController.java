package com.imcst.controller;

import com.imcst.domain.Product;
import com.imcst.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping("/save.do")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = productService.findAll();
        mv.addObject("productList", ps);
        mv.setViewName("product-list");
        return mv;
    }

    @RequestMapping("/update.do")
    public ModelAndView edit(@RequestParam(name = "id", required = true) String productId) throws Exception {
        ModelAndView mv = new ModelAndView();
        Product productInfo = productService.findById(productId);
        mv.addObject("product", productInfo);
        mv.setViewName("product-update");
        return mv;
    }

    /**
     * 更新产品信息
     * @param product
     * @return
     * @throws Exception
     */
    @RequestMapping("/updateById.do")
    public String updateById(Product product) throws Exception {
        productService.updateById(product);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id", required = true) String productId) throws Exception {
        ModelAndView mv = new ModelAndView();
        Product productInfo = productService.findById(productId);
        mv.addObject("product", productInfo);
        mv.setViewName("product-show");
        return mv;
    }
}
