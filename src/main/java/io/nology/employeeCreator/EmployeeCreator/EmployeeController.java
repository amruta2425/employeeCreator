package io.nology.employeeCreator.EmployeeCreator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EmployeeCreator")
public class EmployeeController {
	
	@Autowired
	private EmployeeService EmployeeService;
	
	@GetMapping
	public ResponseEntity<List<EmployeeEntity>>getAllEmployees(){
		List<EmployeeEntity> allEmployees = this.EmployeeService.fetch();
		return new ResponseEntity<>(allEmployees, HttpStatus.OK);
		
	}

}
