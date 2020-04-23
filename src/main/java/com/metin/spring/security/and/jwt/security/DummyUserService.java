package com.metin.spring.security.and.jwt.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class DummyUserService {

    private Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        users.put("yusuf", new User("yusuf", "yusuf123",new ArrayList<>()));
        users.put("metin", new User("metin", "metin123",new ArrayList<>()));
        users.put("dilek", new User("dilek", "dilek123",new ArrayList<>()));
    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }
}
