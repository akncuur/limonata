package com.core.limonata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoolController {

    @GetMapping("/getmet")
    String sayHi() {
        return "Hello World";
    }

}