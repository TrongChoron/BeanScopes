package itsj.thanhtrong.session;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 11:24
 * Filename : SessionController
 */
@Controller
public class SessionController {

    @Resource(name = "sessionScopedBean")
    SessionMessage sessionScopedBean;

    @RequestMapping("/scopes/session")
    public ResponseEntity<Model> getSessionScopeMessage(final Model model){
        model.addAttribute("previousMessage", sessionScopedBean.getMessage());
        sessionScopedBean.setMessage("Good afternoon!");
        model.addAttribute("currentMessage", sessionScopedBean.getMessage());
        return ResponseEntity.ok(model);
    }
}
