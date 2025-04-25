package com.actividadas13.springboot.web.user_list_springboot.Service;

import com.actividadas13.springboot.web.user_list_springboot.Modelos.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> obtenerTodos() {
        return Arrays.asList(
                new User("María", "Gómez", "maria.gomez@example.com"),
                new User("Juan", "Pérez", null),
                new User("Ana", "López", "ana.lopez@example.com"));
    }
}