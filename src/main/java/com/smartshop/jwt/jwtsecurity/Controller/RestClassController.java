package com.smartshop.smartshopjpa.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest_class_controller")
public class RestClassController {

    //localhost:8080//rest_class_controller/registerParty/152222/password

    @RequestMapping(value = "/registerParty/{id}/{password}", method = RequestMethod.POST)
    public boolean registerParty(@RequestBody String str, @PathVariable int pathVariable1, @PathVariable String pathVariable2)
    {
        return true;
    }


    //localhost:8080//rest_class_controller/getParty
    @GetMapping("/getParty")
    public boolean getParty()
    {
        return true;
    }
}
