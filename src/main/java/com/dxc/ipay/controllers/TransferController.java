/*package com.dxc.ipay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.ipay.entites.Transfer;
import com.dxc.ipay.services.ITransferService;

@RestController
@RequestMapping(path = "/transfer")
public class TransferController {
	
	@Autowired
	Transfer transfer;
	
	@Autowired
	ITransferService service;
	
	@PostMapping(path= "/send",consumes = {  "application/json" }, produces = {"application/json" })
	public Transfer addTransfer(@RequestBody Transfer transfer) {
		
		
		return service.addTransfer(transfer);
		
	}
	

	
	
	
	

}
*/