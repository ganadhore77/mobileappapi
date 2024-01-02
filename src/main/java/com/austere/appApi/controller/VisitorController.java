package com.austere.appApi.controller;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.austere.appApi.entity.Visitor;
import com.austere.appApi.repository.VisitorRepo;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@RestController
@CrossOrigin
public class VisitorController {

	@Autowired
	VisitorRepo repository;
	
	@GetMapping("/getVisitors")
    public String getAllData(final HttpServletRequest request,
    		@RequestParam(value = "user_id", required = false) Integer user_id) {
				
		final JsonObject jsonResponse = new JsonObject();
		
		Integer isAdmin = repository.checkAdmin(user_id);
		
		if(isAdmin == 1) {
			List<Visitor> visitordata = repository.getAllVisitorData();
			JsonElement raw_data = new Gson().toJsonTree(visitordata);
			jsonResponse.add("visitor_data", raw_data);
		}
		else {
			List<Visitor> visitordata = repository.getVisitorData(user_id);
			JsonElement raw_data = new Gson().toJsonTree(visitordata);
			jsonResponse.add("visitor_data", raw_data);
		}
		
        return jsonResponse.toString();
	}
	
	@GetMapping("/getCheckedInVisitors")
    public String getCheckedInData(final HttpServletRequest request,
    		@RequestParam(value = "user_id", required = false) Integer user_id) {
				
		final JsonObject jsonResponse = new JsonObject();
		
		Integer isAdmin = repository.checkAdmin(user_id);
		
		if(isAdmin == 1) {
			List<Visitor> visitordata = repository.getAllCheckInData();
			JsonElement raw_data = new Gson().toJsonTree(visitordata);
			jsonResponse.add("visitor_data", raw_data);
		}
		else {
			List<Visitor> visitordata = repository.getCheckInVisitorData(user_id);
			JsonElement raw_data = new Gson().toJsonTree(visitordata);
			jsonResponse.add("visitor_data", raw_data);
		}
		
        return jsonResponse.toString();
	}
}
