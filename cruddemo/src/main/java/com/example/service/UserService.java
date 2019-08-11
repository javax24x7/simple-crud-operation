package com.example.service;

import java.util.List;

import com.example.bean.UserBean;

public interface UserService {
	
	public UserBean getUserBean(Long id);
	
	public List<UserBean> findAll();
	
	public void save(UserBean userBean);
	
	public void update(UserBean userBean);
	
	public void deleteById(Long id);

}
