package com.example.curdope.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.curdope.Dto.Response;
import com.example.curdope.Model.Details;
import com.example.curdope.Service.ServiceInterface;

@CrossOrigin
@RestController
public class MainController {

	@Autowired
	ServiceInterface sinter;
	
	@PostMapping("/details/add")
	public ResponseEntity<Response> addDetails(@RequestBody Details d)
	{
		return new ResponseEntity<Response>(sinter.addDetails(d),HttpStatus.OK);
	}
	
	@GetMapping("/details/viewbyid/{id}")
	public ResponseEntity<Details> getDeatilsById(@PathVariable long id)
	{
		return new ResponseEntity<Details>(sinter.getDetailsById(id),HttpStatus.OK);
	}
	
	@GetMapping("/details/viewalldetails")
	public ResponseEntity<List<Details>> getAllDetails()
	{
		return new ResponseEntity<List<Details>>(sinter.getAllDetails(),HttpStatus.OK);
	}
	
	@DeleteMapping("details/deletebyid")
	public ResponseEntity<Response> deletebYid(@RequestBody Details d)
	{
		return new ResponseEntity<>(sinter.deleteDetails(d.getId()),HttpStatus.OK);
	}
	
	@PutMapping("details/updatedetail")
	public ResponseEntity<Response> updateDetails(@RequestBody Details d)
	{
		return null;
	}
	
	
}
