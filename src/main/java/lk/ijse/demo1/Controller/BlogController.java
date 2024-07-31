package lk.ijse.demo1.Controller;

import lk.ijse.demo1.entity.Blog;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")

public class BlogController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
     @PostMapping("number")
    public int getNumber(){
        return 1;}

@GetMapping("/number/{number}")
public String getNumber(@PathVariable String number) {

    return number;
}
@GetMapping("/object")
    public Object getObject() {

 Blog blog = new Blog();
 return blog;
}
}
