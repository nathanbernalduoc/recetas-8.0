package com.grupo10.sumativa2.controller;

// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

// import com.grupo10.sumativa2.model.Login;
// import com.grupo10.sumativa2.model.Usuario;
// import com.grupo10.sumativa2.service.UsuarioService;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UsuarioController {
    
    // @Autowired
    // UsuarioService usuarioService;

    // public UsuarioController() {
    // }

    // @PostMapping("/login")
    // public Login getUsuario(@RequestBody Login loginReq) {
    //     Login login = new Login();
    //     System.out.println("Usuario "+loginReq.getUsuario());
    //     Optional<Usuario> usuario = usuarioService.getByUsuario(loginReq.getUsuario());
    //     if (!usuario.isEmpty()) {
    //         login = new Login(loginReq.getUsuario(), "token-asdasd123");
    //         login.setStatus("success");
    //     } else {
    //         login.setStatus("error");
    //     } 
    //     return login;
    // }

}
