package com.sprin_practice.spring.controller;
import java.util.List;
import com.sprin_practice.spring.Entity.EmployeeEntity;
import com.sprin_practice.spring.Repo.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Hotel")
public class EmployeeController {
    
    @Autowired
    repo Repo;

    @PostMapping("/")
	public List<EmployeeEntity> add(@RequestBody EmployeeEntity emp)
	{
		Repo.save(emp);
		return Repo.findAll();
	}

    @GetMapping("/")
    public List<EmployeeEntity> getdata(@RequestBody EmployeeEntity emp){
        Repo.save(emp);
        return Repo.findAll();
    }

    @PutMapping("/")
	public List<EmployeeEntity> Putdata(@RequestBody EmployeeEntity emp)
	{
		Repo.save(emp);
		return Repo.findAll();
	}
    
    @DeleteMapping("/{id}")
	public List<EmployeeEntity> delete(@PathVariable("id") int id)
	{
		Repo.deleteById(id);
		return Repo.findAll();
	}
}
