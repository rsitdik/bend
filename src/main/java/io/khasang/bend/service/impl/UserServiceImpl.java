package io.khasang.bend.service.impl;

import io.khasang.bend.dao.UserDao;
import io.khasang.bend.dto.UserDto;
import io.khasang.bend.entity.User;
import io.khasang.bend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("userService")
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private UserDto userDto;

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public User delete(long id) {
        return userDao.delete(userDao.getById(id));
    }

    @Override
    public UserDto getById(long id) {
        return userDto.getUserDtoFromUser(userDao.getById(id));
    }

    @Override
    public Set<UserDto> getAllUsers() {
        return userDto.getUserDtoSetFromUser(userDao.getAllSet());
    }

    @Override
    public Set<UserDto> getAllUsersByName(String name) {
        return userDto.getUserDtoSetFromUser(userDao.getAllUsersByName(name));
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
