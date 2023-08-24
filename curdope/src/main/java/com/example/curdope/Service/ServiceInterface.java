package com.example.curdope.Service;

import java.util.List;

import com.example.curdope.Dto.Response;
import com.example.curdope.Model.Details;

public interface ServiceInterface {

	public Response addDetails(Details d);
	public Response deleteDetails(long id);
	public Details getDetailsById(long id);
	public List<Details> getAllDetails();
}
