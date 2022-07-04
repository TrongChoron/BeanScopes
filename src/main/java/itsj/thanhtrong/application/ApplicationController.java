package itsj.thanhtrong.application;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 10:18
 * Filename : Controller
 */
@Controller
@RequestMapping("")
public class ApplicationController {

    @Resource(name = "applicationScopedBean")
    Message applicationScopedBean;

    @RequestMapping("/scopes/application")
    public ResponseEntity<Model> getMessage(final Model model){
        model.addAttribute("previousMessage", applicationScopedBean.getMessage());
        applicationScopedBean.setMessage("Good afternoon!");
        model.addAttribute("currentMessage", applicationScopedBean.getMessage());
        return ResponseEntity.ok(model);
    }
}
