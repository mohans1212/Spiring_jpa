package com.springboot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.model.State;

import java.util.List;

public interface SRepo extends JpaRepository<State,Integer>
{

}
