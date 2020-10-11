package a_springmvc_view_controller_;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/main")
    public String showPage(){
        return "main_menu";
    }

}
