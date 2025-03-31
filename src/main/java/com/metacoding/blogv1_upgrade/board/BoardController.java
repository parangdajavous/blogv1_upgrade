package com.metacoding.blogv1_upgrade.board;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BoardController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
