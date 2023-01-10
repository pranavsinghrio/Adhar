package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    Repository repository;

    public void saveAdhar(Long id, String name) {

        repository.saveAdhar(id,name);
    }

    public String getnamebyId(Long id) {

        return repository.getnamebyId(id);
}
}