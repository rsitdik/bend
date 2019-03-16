package io.khasang.bend;

import io.khasang.bend.entity.Car;
import io.khasang.bend.entity.Employee;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeControllerIntegrationTest {
    private final static String ROOT = "http://localhost:8080/employee";
    private final static String ADD = "/add";
    private final static String GET_BY_ID = "/get/{id}";
    private final static String GET_ALL = "/all";

    @Test
    public void checkAddEmployee() {
        Employee employee = createEmployee();

        RestTemplate template = new RestTemplate();
        ResponseEntity<Employee> responseEntity = template.exchange(
                ROOT + GET_BY_ID,
                HttpMethod.GET,
                null,
                Employee.class,
                employee.getId()
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Employee recievedEmployee = responseEntity.getBody();
        assertNotNull(recievedEmployee);
    }

    @Test
    public void checkGetAllEmployees(){
        RestTemplate template = new RestTemplate();
        createEmployee();
        createEmployee();

        ResponseEntity<List<Employee>> result = template.exchange(
                ROOT + GET_ALL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Employee>>() {
                }
        );

        List<Employee> employees = result.getBody();
        assertNotNull(employees);
    }

    private Employee createEmployee() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        Employee employee = prefillEmployee();

        HttpEntity<Employee> entity = new HttpEntity<>(employee, headers);
        RestTemplate template = new RestTemplate();

        Employee createdEmployee = template.exchange(
                ROOT + ADD,
                HttpMethod.POST,
                entity,
                Employee.class
        ).getBody();

        assertNotNull(createdEmployee);
        assertEquals("Henry Morgan", createdEmployee.getName());
        return createdEmployee;
    }

    private Employee prefillEmployee() {
        Employee employee = new Employee();
        employee.setName("Henry Morgan");
        employee.setTitle("clerk");

        Car car1 = new Car();
        car1.setModel("Ford");

        Car car2 = new Car();
        car2.setModel("Audi");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        employee.setCarList(carList);

        return employee;
    }
}