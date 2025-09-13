package br.com.fiap._espg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heath-check")
public class HealthCheckController {

    @GetMapping()
    public String HealthCheck() {
        return "API CP1 OK!";
    }
}
