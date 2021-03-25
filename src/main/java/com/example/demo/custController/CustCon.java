package com.example.demo.custController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.CustomerRepository;

@RestController
public class CustCon {
	@Autowired
	CustomerRepository myclass;

	//gets
	@GetMapping("/customers")
	public String getAll() {
		return myclass.findAll().toString();
	}
	
	@GetMapping("/customers/{id}")
	public String getId(@PathVariable String id) {
		//id = Long.parseLong(id);
		return myclass.findById(Long.parseLong(id)).toString();	
	}
	
	//deletes	
	@DeleteMapping("/customers/{id}")
	  public String deleteCustomers(@PathVariable Long id) {
	    myclass.deleteById(id);
	    
	    return "We did it!";
	  }
	
	//create
	
	//put
}
