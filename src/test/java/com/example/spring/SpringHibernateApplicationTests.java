package com.example.spring;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.dao.CustomerDAO;
import com.example.spring.model.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringHibernateApplicationTests {

    @Autowired
    private CustomerDAO customerDao;

    @Test
    public void testSaveCustomer() {
        Customer c1 = new Customer();
        c1.setFirstName("Ender");
        c1.setLastName("Yıl");
        customerDao.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Ender");
        c2.setLastName("Yıldı");
        customerDao.save(c2);
        
        Customer c3 = new Customer();
        c3.setFirstName("Ender");
        c3.setLastName("Yıldırım");
        customerDao.save(c3);
        
        List<Customer> customers = customerDao.list();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

}
