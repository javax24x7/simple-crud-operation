package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.bean.UserBean;
import com.example.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value= {"/","/list"}, method = RequestMethod.GET )
	public ModelAndView list(ModelAndView modelAndView) {
		try{
			List<UserBean> list = userService.findAll();
			modelAndView.addObject("list", list);
			modelAndView.setViewName("list");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
	@RequestMapping(value= "/add", method = RequestMethod.GET )
	public ModelAndView addUser(ModelAndView modelAndView) {
		try{
			modelAndView.addObject("userBean", new UserBean());
			modelAndView.setViewName("add");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
	@RequestMapping(value="/add", method = RequestMethod.POST )
	public ModelAndView add(@Valid UserBean userBean) {
		ModelAndView modelAndView = new ModelAndView();
		try{
			if(userBean != null) {
				userService.save(userBean);
				modelAndView.setViewName("redirect:/list");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET )
	public ModelAndView edit(@PathVariable("id") Long id) {
		ModelAndView modelAndView = new ModelAndView();
		try{
			if(id != null) {
				modelAndView.addObject("userBean", userService.getUserBean(id));
				modelAndView.setViewName("edit");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST )
	public ModelAndView update(@Valid UserBean userBean) {
		ModelAndView modelAndView = new ModelAndView();
		try{
			if(userBean != null) {
				userService.update(userBean);
				modelAndView.setViewName("redirect:/list");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET )
	public ModelAndView delete(@PathVariable("id") Long id) {
		ModelAndView modelAndView = new ModelAndView();
		try{
			if(id != null) {
				userService.deleteById(id);
				modelAndView.setViewName("redirect:/list");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
}
