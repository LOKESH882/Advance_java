package com.tks.lokesh_Springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tks.lokesh_Springboot.entity.Employee;

@RestController
public class EmployeeController {
	//localhost:8080/getAll - HTTP End Point Url
	@RequestMapping(value = "getAll",method = RequestMethod.GET)
	public void getAllData() {
		System.out.println("You Are In Get All Method()...");
	}
	
	//localhost:8080/getAllRecord
	
	@RequestMapping(value = "getAllRecord",method= RequestMethod.GET)
	public String getAllRecord() {
		System.out.println("Get All Record...");
		return "All Record Return";
	}
	
	//localhost:8080/addData
	@RequestMapping(value = "addData",method = RequestMethod.POST)
	public void SendData(@RequestBody Employee emp) {
		System.out.println(emp);
	}
	// localhost:8080/adddData2
	@RequestMapping(value = "addData2",method = RequestMethod.POST)
	public String sendData2(@RequestBody Employee emp) {
		System.out.println(emp);
		return "Data Added Into Database";
	}
	
	// localhost:8080/updateData/100
	
	@RequestMapping(value = "updateData/{id}",method = RequestMethod.PUT)
	public void updateData(@RequestBody Employee emp, @PathVariable int id) {
		System.out.println("ID:- "+id);
		System.out.println(emp);
		System.out.println("Data Updated...");
	}
	
	// localhost:8080/updateData2/3
	@RequestMapping(value = "updateData2/{id}",method = RequestMethod.PUT)
	public String updateData2(@RequestBody Employee emp, @PathVariable int id) {
		System.out.println("ID:- "+id);
		emp.setId(id);
		return emp.toString();
	}
	
	// localhost:8080/deleteData/4
	@RequestMapping(value = "deleteData/{id}",method = RequestMethod.DELETE)
	public void deleteData(@RequestBody Employee emp, @PathVariable int id) {
		System.out.println("ID :- "+id);
		System.out.println(emp);
		System.out.println("Record Delete...");
	}
	
	// localhost:8080/deleteData2/5
	@RequestMapping(value = "deleteData2/{id}",method = RequestMethod.DELETE)
	public String deleteData2(@RequestBody Employee emp, @PathVariable int id) {
		System.out.println("ID:-"+id);
		System.out.println(emp);
		return "Record Delete...";
	}
}
