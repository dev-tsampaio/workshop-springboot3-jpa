package com.github.dev_tsampaio.projetowebservices.resources;

import com.github.dev_tsampaio.projetowebservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Thales", "thasda@@", "3123132", "12312");
        return ResponseEntity.ok().body(u);
    }

}
