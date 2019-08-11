package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.UserBean;
@Repository
public interface UserRepository extends JpaRepository<UserBean, Long>{

}
