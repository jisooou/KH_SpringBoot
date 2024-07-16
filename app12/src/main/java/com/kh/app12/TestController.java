package com.kh.app12;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String test(HttpServletResponse resp){
        Cookie cookie = new Cookie("adBlock", "block");
        //제거된 광고가 24초 후에 다시 뜬다.
        cookie.setMaxAge(24);
        resp.addCookie(cookie);
        return "redirect:/home";
    }

}
