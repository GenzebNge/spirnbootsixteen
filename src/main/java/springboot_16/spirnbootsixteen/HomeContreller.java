package springboot_16.spirnbootsixteen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContreller {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/2")
    public String page2(){
        return "page2";
    }

    @RequestMapping("/3")
    public String page3(){
        return "page3";
    }

    @RequestMapping("/4")
    public String myPage(){
        return "mypage";
    }
}
