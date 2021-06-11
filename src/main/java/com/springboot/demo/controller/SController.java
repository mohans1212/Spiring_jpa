package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.demo.dao.SRepo;
import com.springboot.demo.model.State;

@RestController
public class SController
{
	@Autowired
	SRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@DeleteMapping("/dstate/{id}")
	public String deleteState(@PathVariable int id)
	{
		State a = repo.getOne(id);
		repo.delete(a);
		return "deleted";
	}
	
	@PostMapping(path="/pstate",consumes= {"application/json"})
	public State addState(@RequestBody State state)
	{
		repo.save(state);
		return state;
	}
	@GetMapping(path="/gstate",consumes= {"application/json"})
	public List<State> getState()
	{
		return repo.findAll();
			
	}
	@PutMapping(path="/ustate",consumes= {"application/json"})
	public State saveOrUpdateState(@RequestBody State state)
	{
		repo.save(state);
		return state;
	}
	
	
	@RequestMapping("/state/{id}")
	public Optional<State> getState(@PathVariable("id")int id)
	{
		return repo.findById(id);
		
		
	}
}
