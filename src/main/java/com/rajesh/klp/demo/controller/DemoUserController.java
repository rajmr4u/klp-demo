package com.rajesh.klp.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.klp.demo.entity.DemoUser;
import com.rajesh.klp.demo.repository.DemoUserRepository;

@RestController
@RequestMapping("/user")
public class DemoUserController {

    @Autowired
	 private final DemoUserRepository repository;

	    public DemoUserController(DemoUserRepository repository) {
	        this.repository = repository;
	    }

	    @PostMapping
	    public DemoUser createUser(@RequestBody DemoUser user) {
	    	
	    	if (!user.getType().equals("USER") && !user.getType().equals("ADMIN")) {
	            throw new IllegalArgumentException("Invalid type, must be 'USER' or 'ADMIN'");
	            
	        }
	        return repository.save(user);
	       
	    }

	    @GetMapping("/{id}")
	    public DemoUser getUser(@PathVariable Integer id) {
	    	System.out.println("Demo User getId ....."+ id);
	        return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	    }

	    @GetMapping
	    public List<DemoUser> getUsers(@RequestParam(required = false, name = "type-filter") String type) {
	    	System.out.println("Demo User All Users .....");
	        return (type == null) ? repository.findAll() : repository.findByType(type);
	    }

	
}