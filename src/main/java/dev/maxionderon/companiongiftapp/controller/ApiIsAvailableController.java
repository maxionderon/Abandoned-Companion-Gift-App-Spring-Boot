package dev.maxionderon.companiongiftapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiIsAvailableController {

    @GetMapping()
    String apiIsAvailable() {

        return "API is Available";

    }

}