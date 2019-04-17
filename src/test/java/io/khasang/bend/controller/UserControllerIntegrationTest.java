package io.khasang.bend.controller;

import io.khasang.bend.dto.UserDto;
import io.khasang.bend.entity.HomePagesUrl;
import io.khasang.bend.entity.User;
import io.khasang.bend.model.Gender;
import io.khasang.bend.model.UserStatus;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserControllerIntegrationTest {
    private static final String ROOT = "http://localhost:8080/users";
    private static final String ADD = "/add";
    private static final String GET_BY_ID = "/get/{id}";
    private static final String GET_BY_NAME = "/name/{name}";
    private static final String GET_ALL = "/all";

    @Test
    public void checkAddUser() {
        User user = createUser();
        RestTemplate template = new RestTemplate();
        ResponseEntity<UserDto> responseEntity = template.exchange(
                ROOT + GET_BY_ID,
                HttpMethod.GET,
                null,
                UserDto.class,
                user.getId()
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        UserDto receivedUserDot = responseEntity.getBody();
        assertNotNull(receivedUserDot);
    }

    @Test
    public void checkGetAll() {
        RestTemplate template = new RestTemplate();
        createUser();
        createUser();

        ResponseEntity<List<UserDto>> result = template.exchange(
                ROOT + GET_ALL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserDto>>() {
                }
        );

        List<UserDto> users = result.getBody();
        assertNotNull(users);
    }

    @Test
    public void checkGetByName() {
        RestTemplate template = new RestTemplate();
        User user = createUser();
        createUser();

        ResponseEntity<List<UserDto>> result = template.exchange(
                ROOT + GET_BY_NAME,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserDto>>() {
                },
                user.getName()
        );

        List<UserDto> users = result.getBody();
        assertNotNull(users);
    }

    private User createUser() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        User user = prefillUser();
        HttpEntity<User> entity = new HttpEntity<>(user, headers);
        RestTemplate template = new RestTemplate();
        User createdUser = template.exchange(
                ROOT + ADD,
                HttpMethod.POST,
                entity,
                User.class
        ).getBody();

        assertNotNull(createdUser);
        assertEquals("Ivan", createdUser.getName());
        return createdUser;
    }

    private HomePagesUrl createUrl(){
        HomePagesUrl url = new HomePagesUrl();
        url.setEntityId(0);
        url.setUrl(String.valueOf(url.hashCode()));
        return url;
    }

    private User prefillUser() {
        User user = new User();
        user.setName("Ivan");
        user.setLastName("Dulin");
        user.setAge(40);
        user.setGender(Gender.NO_DATA);
        user.setDateOfBirth(LocalDate.of(1979, 10, 10));
        user.setEmail("ivan.dulin@gmail.com");
        user.setPassword("12345");
        user.setPhoneNumber("800-900-1010");
        user.setRole(1);
        user.setOnMap(true);
        user.setHealthLimited(false);
        user.setUserDescription("NERD");
        user.setInterests("Wakeboarding");
        user.setUrl(createUrl());
        return user;
    }
}
