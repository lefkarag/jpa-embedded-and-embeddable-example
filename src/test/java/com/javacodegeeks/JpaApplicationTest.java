package com.javacodegeeks;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaApplicationTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void testSaveAndGetEntity() {
        // create entities
        Address address = new Address();
        address.setPostcode("W5");
        address.setStreet("45 Broadway");
        address.setCity("London");
        address.setCountry("UK");

        Employee employee = new Employee();
        employee.setFullname("Keith Henderson");
        employee.setSalary(50000);
        employee.setAddress(address);

        // save entity
        employeeRepository.save(employee);

        // assert entity
        List<Employee> employees = employeeRepository.findAll();
        assertEquals(1, employees.size());
        Employee savedEmployee = employees.get(0);
        assertTrue(employee.getId() > 0);
        assertEquals(employee.getFullname(), savedEmployee.getFullname());
        assertEquals(employee.getSalary(), savedEmployee.getSalary());
        assertEquals(employee.getAddress().getPostcode(), savedEmployee.getAddress().getPostcode());
        assertEquals(employee.getAddress().getStreet(), savedEmployee.getAddress().getStreet());
        assertEquals(employee.getAddress().getCity(), savedEmployee.getAddress().getCity());
        assertEquals(employee.getAddress().getCountry(), savedEmployee.getAddress().getCountry());
    }
}
