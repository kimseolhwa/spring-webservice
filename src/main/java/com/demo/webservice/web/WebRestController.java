package com.demo.webservice.web;


import com.demo.webservice.dto.posts.PostsSaveRequestDto;
import com.demo.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    //@ResponseBody
    //@RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    //@ResponseBody
    //@RequestMapping(method = RequestMethod.POST)
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}