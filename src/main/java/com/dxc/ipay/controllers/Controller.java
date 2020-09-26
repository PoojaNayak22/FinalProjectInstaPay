package com.dxc.ipay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.ipay.entites.AdminSite;
import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.entites.RecurringAccount;
import com.dxc.ipay.entites.Transfer;
import com.dxc.ipay.services.IAdminSiteService;
import com.dxc.ipay.services.IFixedDepositService;
import com.dxc.ipay.services.IRecurringAccountService;
import com.dxc.ipay.services.ITransferService;

@RestController
@RequestMapping(path = "/transfer")
public class Controller {
	
	@Autowired
	Transfer transfer;
	
	@Autowired
	ITransferService service;
	
	@Autowired
	AdminSite admin;
	
	@Autowired
	IAdminSiteService servi;
	
	@Autowired
	RecurringAccount recurr;
	
	@Autowired
	IRecurringAccountService reserv;
	
	@Autowired
	FixedDeposit fixed;
	
	@Autowired
	IFixedDepositService fixserv;
	
	
	

	
	
	@PostMapping(path= "/send",consumes = {  "application/json" }, produces = {"application/json" })
	public Transfer addTransfer(@RequestBody Transfer transfer) {
		
		
		return service.addTransfer(transfer);
		
	}
	
	@PostMapping(path= "/add",consumes = {  "application/json" }, produces = {"application/json" })
	public AdminSite addRequest(@RequestBody AdminSite admin) {
		
		
		return servi.addRequest(admin);
		
	}

	@PutMapping(path= "/update",consumes = {  "application/json" }, produces = {"application/json" })
	public AdminSite updateRequest(@RequestBody AdminSite admin) {
		
		
		return servi.updateRequest(admin);
		
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int userId) {

		// System.out.println(product);
		
		servi.deleteRequest(userId);

		return "Request deleted with userId  " + userId;

	}
	
	@PostMapping(path= "/recurring",consumes = {  "application/json" }, produces = {"application/json" })
	public RecurringAccount addMoney(@RequestBody RecurringAccount recurr) {
		
		
		return reserv.addAmount(recurr);
		
	}
	
	@PostMapping(path= "/fixed",consumes = {  "application/json" }, produces = {"application/json" })
	public FixedDeposit  addAmount(@RequestBody FixedDeposit fixed) {
		
		
		return fixserv.addAmount(fixed);
		
	}


	

	

}
