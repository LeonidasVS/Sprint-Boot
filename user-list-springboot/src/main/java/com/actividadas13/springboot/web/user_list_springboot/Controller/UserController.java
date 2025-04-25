package com.actividadas13.springboot.web.user_list_springboot.Controller;

import com.actividadas13.springboot.web.user_list_springboot.Modelos.User;
import com.actividadas13.springboot.web.user_list_springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String mostrarUsuarios(Model model) {
        List<User> usuarios = userService.obtenerTodos();
        model.addAttribute("usuarios", usuarios);
        return "users";
    }
}