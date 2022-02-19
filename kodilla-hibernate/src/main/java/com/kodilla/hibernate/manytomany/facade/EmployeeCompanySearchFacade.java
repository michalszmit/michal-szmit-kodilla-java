package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeCompanySearchFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompaniesByPartialName(String partialName){
        return companyDao.retrieveCompaniesByPartialName(partialName);
    }

    public List<Employee> searchEmployeesByPartialName(String partialName){
        return employeeDao.retrieveEmployeesByPartialName(partialName);
    }
}