package itsj.thanhtrong.request;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 11:19
 * Filename : RequestController
 */
@Controller
public class RequestController {
    @Resource(name = "requestScopedBean")
    RequestMessage requestScopedBean;

    @RequestMapping("/scopes/request")
    public ResponseEntity<Model> getRequestScopeMessage(final Model model) {
        model.addAttribute("previousMessage", requestScopedBean.getMessage());
        requestScopedBean.setMessage("Good morning!");
        model.addAttribute("currentMessage", requestScopedBean.getMessage());
        return ResponseEntity.ok(model);
    }
}
