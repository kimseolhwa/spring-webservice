package com.demo.webservice.web;

import com.demo.webservice.dto.posts.PostsMainResponseDto;
import com.demo.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        List<PostsMainResponseDto> temp = postsService.findAllDesc();
        model.addAttribute("posts", temp);
        return "main";
    }
}