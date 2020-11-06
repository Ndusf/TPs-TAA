package istic.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


import istic.data.jpa.domain.User;


@Transactional
public interface UserDao extends JpaRepository<User, Long>{
	  public User findByEmail(String name);

}