package com.test.bhuvan.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bhuvan on 2/7/16.
 */
@Controller
public class AboutController {
    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String aboutPage() {
        return "about";
    }
}
