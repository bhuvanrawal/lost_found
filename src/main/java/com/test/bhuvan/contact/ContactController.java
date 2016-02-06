package com.test.bhuvan.contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bhuvan on 2/7/16.
 */
@Controller
public class ContactController {
    @RequestMapping(value = "contact", method = RequestMethod.GET)
    public String contactPage() {
        return "contact";
    }
}
