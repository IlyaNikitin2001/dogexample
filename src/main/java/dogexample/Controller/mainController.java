package dogexample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Generated;

/**
 * Created by USER on 03.11.2017.
 */
@Controller
public class mainController {
    @GetMapping("/")
    public String main(){
return "index";
    }
}
