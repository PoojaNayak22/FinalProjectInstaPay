/*package com.dxc.ipay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.ipay.entites.AdminSite;
import com.dxc.ipay.services.IAdminSiteService;

@RestController
@RequestMapping(path = "/request")
public class AdminSiteController {
	

		
		@Autowired
		AdminSite admin;
		
		@Autowired
		IAdminSiteService service;
		
		@PostMapping(path= "/add",consumes = {  "application/json" }, produces = {"application/json" })
		public AdminSite addRequest(@RequestBody AdminSite admin) {
			
			
			return service.addRequest(admin);
			
		}
	
		@PutMapping(path= "/update",consumes = {  "application/json" }, produces = {"application/json" })
		public AdminSite updateRequest(@RequestBody AdminSite admin) {
			
			
			return service.updateRequest(admin);
			
		}
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable("id") int userId) {

			// System.out.println(product);
			
			service.deleteRequest(userId);

			return "Request deleted with userId  " + userId;

		}  
		
	
	
	}

    */