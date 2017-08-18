package com.example.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.model.Customer;

@Repository
@Transactional
@EnableTransactionManagement
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Customer c) {
        currentSession().save(c);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> list() {
        return currentSession().createQuery("FROM Customer").getResultList();
    }

}
