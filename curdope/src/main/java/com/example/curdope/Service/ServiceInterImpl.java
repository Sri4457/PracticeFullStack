package com.example.curdope.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curdope.Dto.Response;
import com.example.curdope.Model.Details;
import com.example.curdope.Repository.DetailRepository;

@Service
public class ServiceInterImpl implements ServiceInterface{

	@Autowired
	DetailRepository drepo;
	
	@Override
	public Response addDetails(Details d) {
		try {
			drepo.save(d);
			return new Response(false,"Added successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
			return new Response(true,"Something Went Wrong");
		}
	}

	@Override
	public Response deleteDetails(long id) {
		try {
			drepo.deleteById(id);
			return new Response(false,"Deleted successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
			return new Response(true,"Something Went Wrong");
		}
	}

	@Override
	public Details getDetailsById(long id) {
		return drepo.findById(id).get();
	}

	@Override
	public List<Details> getAllDetails() {
		return drepo.findAll();
	}

}
