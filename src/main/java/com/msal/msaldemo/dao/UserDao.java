package com.msal.msaldemo.dao;

import com.msal.msaldemo.dao.model.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Userr,Integer> {



}
