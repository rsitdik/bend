package io.khasang.bend.dto;

import io.khasang.bend.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DisciplineDto {
    private Long id;
    private String name;
    private List<User> userList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
