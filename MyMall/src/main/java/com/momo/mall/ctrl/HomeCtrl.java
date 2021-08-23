package com.momo.mall.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jason.Mo
 */
@Controller
public class HomeCtrl {

    @ResponseBody
    @GetMapping("/home/goods")
    public String getGoods(@RequestParam("type") String type, @RequestParam("page") Integer page, Model model) {

        return "Home/goods";
    }
}
