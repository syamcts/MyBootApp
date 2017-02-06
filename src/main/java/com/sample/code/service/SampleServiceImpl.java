package com.sample.code.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{

	@Override
	public void saveUser(String userName) throws Exception {
		
		System.out.println("Saved successfully");
		
		
	}

	@Override
	public void deleteUser(String userName) throws Exception {
		System.out.println("deleted successfully");
		
	}
	
	@Override
	public void updateUser(String userName) throws Exception {
		System.out.println("updated successfully");
	}

	@Override
	public void create(String userName) throws Exception {
		System.out.println("Created successfully");
		
	}

	@Override
	public String getUsername() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
