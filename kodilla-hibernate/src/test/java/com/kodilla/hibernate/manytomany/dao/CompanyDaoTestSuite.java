package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Transactional
    @Test
    public void testRetrieveEmployeeByLastname() {
        //Given
        Employee employee1 = new Employee("John", "Gates");
        Employee employee2 = new Employee("Alice", "Gates");
        Employee employee3 = new Employee("Adam", "Nowak");
        Employee employee4 = new Employee("Katarzyna", "Kowalska");
        Employee employee5 = new Employee("Jennifer", "Gates");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(employee1);
        softwareMachine.getEmployees().add(employee2);
        dataMaesters.getEmployees().add(employee3);
        greyMatter.getEmployees().add(employee4);
        greyMatter.getEmployees().add(employee5);

        employee1.getCompanies().add(softwareMachine);
        employee2.getCompanies().add(softwareMachine);
        employee3.getCompanies().add(dataMaesters);
        employee4.getCompanies().add(greyMatter);
        employee5.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Employee> lastnameSearch = employeeDao.retrieveByLastname("Gates");

        //Then
        assertEquals(3, lastnameSearch.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Transactional
    @Test
    public void retrieveByFirst3Characters() {
        //Given
        Employee employee1 = new Employee("John", "Gates");
        Employee employee2 = new Employee("Alice", "Gates");
        Employee employee3 = new Employee("Adam", "Nowak");
        Employee employee4 = new Employee("Katarzyna", "Kowalska");
        Employee employee5 = new Employee("Jennifer", "Gates");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(employee1);
        softwareMachine.getEmployees().add(employee2);
        dataMaesters.getEmployees().add(employee3);
        greyMatter.getEmployees().add(employee4);
        greyMatter.getEmployees().add(employee5);

        employee1.getCompanies().add(softwareMachine);
        employee2.getCompanies().add(softwareMachine);
        employee3.getCompanies().add(dataMaesters);
        employee4.getCompanies().add(greyMatter);
        employee5.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> firstThreeChars = companyDao.retrieveByFirst3Characters("Gre");

        //Then
        assertEquals(2, firstThreeChars.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}