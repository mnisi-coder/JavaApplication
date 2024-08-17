package com.crud.crud.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.crud.model.User;

@Service
public interface UserService {
    List<User> getAllEntities();
    User getEntityById(Long id);
    User createEntity(User entity);
    User updateEntity(Long id, User entity);
    void deleteEntity(Long id);
}