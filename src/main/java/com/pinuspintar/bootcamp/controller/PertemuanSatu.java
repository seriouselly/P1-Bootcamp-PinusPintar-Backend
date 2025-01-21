package com.pinuspintar.bootcamp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PertemuanSatu {
    @GetMapping("/hello")
    public String sayHello() {
        return "Halo, nama saya Selly\n" +
                "umur saya 26 tahun\n" +
                "saya perempuan\n" +
                "asal Jakarta\n" +
                "motivasi saya bootcamp karena penasaran dengan program belajar bootcamp pinus pintar";
    }
}
