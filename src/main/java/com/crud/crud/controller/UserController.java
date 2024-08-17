package com.crud.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.model.User;
import com.crud.crud.service.UserService;

@Controller
@RestController
@RequestMapping("/api/entities")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllEntities() {
        return service.getAllEntities();
    }

    @GetMapping("/{id}")
    public User getEntityById(@PathVariable Long id) {
        return service.getEntityById(id);
    }

    @PostMapping
    public User createEntity(@RequestBody User entity) {
        return service.createEntity(entity);
    }

    @PutMapping("/{id}")
    public User updateEntity(@PathVariable Long id, @RequestBody User entity) {
        return service.updateEntity(id, entity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        service.deleteEntity(id);
    }
}
