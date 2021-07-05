package com.ankit.controller;

import com.ankit.dto.ResponseDTO;
import com.ankit.utility.AppUtility;
import com.ankit.utility.EndpointURL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    AppUtility utility;

    /*@GetMapping(path = "/")
    public @ResponseBody String welcome() {
        return "Welcome!";
    }*/

    @GetMapping(path = EndpointURL.GET_REVERSED_STRING)
    public @ResponseBody String getReversedData(@PathVariable String received) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResponse(utility.reversedData(received));
        return responseDTO.toString();
    }
}
