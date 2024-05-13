package application.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Usuario;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
    public String login(@RequestBody Usuario){}
}
