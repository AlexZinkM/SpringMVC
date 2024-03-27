package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    public class MyController {

        @RequestMapping("/first-view")
        public String showFirstView() {
            return "first-view";
        }

    }




