package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.UserBean;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public UserBean getUserBean(Long id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

	@Override
	public List<UserBean> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void save(UserBean userBean) {
		// TODO Auto-generated method stub
		userRepository.save(userBean);
	}

	@Override
	public void update(UserBean userBean) {
		// TODO Auto-generated method stub
		userRepository.save(userBean);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	
	
	
}
