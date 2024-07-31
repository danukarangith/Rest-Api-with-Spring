package lk.ijse.demo1.Controller;

import lk.ijse.demo1.entity.Blog;
import lk.ijse.demo1.repository.BlogRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")

public class BlogController {
    @Autowired
    public BlogRepository blogRepository ;

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
@PostMapping("/savepost")
public void savePOst(@RequestBody Blog blog){
   blogRepository.save(blog);

}
}
