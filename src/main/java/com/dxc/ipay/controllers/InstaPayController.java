package com.dxc.ipay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.ipay.entites.AccountDetails;
import com.dxc.ipay.entites.AdminSite;
import com.dxc.ipay.entites.CardDetails;
import com.dxc.ipay.entites.DTHPayment;
import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.entites.ReoccurringAccount;
import com.dxc.ipay.entites.Register;
import com.dxc.ipay.entites.SavingsAccount;
import com.dxc.ipay.entites.Transfer;
import com.dxc.ipay.entites.WifiBill;
import com.dxc.ipay.services.IAccountDetailsService;
import com.dxc.ipay.services.IAdminSiteService;
import com.dxc.ipay.services.IBenificiaryDetailsService;
import com.dxc.ipay.services.ICardDetailsService;
import com.dxc.ipay.services.IDTHPaymentService;
import com.dxc.ipay.services.IFixedDepositService;
import com.dxc.ipay.services.IReoccurringAccountService;
import com.dxc.ipay.services.IRegisterService;
import com.dxc.ipay.services.ISavingsAccountService;
import com.dxc.ipay.services.ITransferService;
import com.dxc.ipay.services.IWifiBillService;

@RestController
@RequestMapping(path = "/instapay")
public class InstaPayController {
	
	@Autowired
	Transfer transfer;
	
	@Autowired
	ITransferService service;
	
	@Autowired
	AdminSite admin;
	
	@Autowired
	IAdminSiteService servi;
	
	@Autowired
	ReoccurringAccount recurr;
	
	@Autowired
	IReoccurringAccountService reserv;
	
	@Autowired
	FixedDeposit fixed;
	
	@Autowired
	IFixedDepositService fixserv;
	
	@Autowired
	Register register;
	
	@Autowired
	IRegisterService regservice;
	
	@Autowired
	AccountDetails account;
	
	@Autowired
	IAccountDetailsService accservice;
	
	@Autowired
	IBenificiaryDetailsService benservice;
	
	@Autowired
	CardDetails card;
	
	@Autowired
	ICardDetailsService cardserv;
	
	@Autowired
	SavingsAccount savings;
	
	@Autowired
	ISavingsAccountService savingsservice;
	
	@Autowired
	WifiBill wifibill;
	
	@Autowired
	IWifiBillService wifibillservice;
	
	@Autowired
	DTHPayment dthpayment;
	
	@Autowired
	IDTHPaymentService dthpaymentservice;
	
	
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
	public ReoccurringAccount addMoney(@RequestBody ReoccurringAccount recurr) {
		
		
		return reserv.addAmount(recurr);
		
	}
	
	@PostMapping(path= "/fixed",consumes = {  "application/json" }, produces = {"application/json" })
	public FixedDeposit  addAmount(@RequestBody FixedDeposit fixed) {
		
		
		return fixserv.addAmount(fixed);
		
	}

	@PostMapping(path= "/register",consumes = {  "application/json" }, produces = {"application/json" })
	public Register addCustomer(@RequestBody Register register) {
		
		
		return regservice.addCustomer(register);
		
	}
	
	@PostMapping(path= "/addAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails addDetails(@RequestBody AccountDetails account) {
		
		
		return accservice.addDetails(account);
		
	}

	@PutMapping(path= "/updateAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails updateDetails(@RequestBody AccountDetails account) {
		
		
		return accservice.updateDetails(account);
		
	}
	
	@PostMapping(path= "/addBenificiaryAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails addBenificiaryDetails(@RequestBody AccountDetails account) {
		
		
		return benservice.addBenificiaryDetails(account);
		
	}

	@PutMapping(path= "/updateBenificiaryAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails updateBenificiaryDetails(@RequestBody AccountDetails account) {
		
		
		return benservice.updateBenificiaryDetails(account);
		
	}
	
	@PostMapping(path= "/addCardDetails",consumes = {  "application/json" }, produces = {"application/json" })
	public CardDetails addCardDetails(@RequestBody CardDetails card) {
		
		
		return cardserv.addCardDetails(card);
		
	}

	@PutMapping(path= "/updateCardDetails",consumes = {  "application/json" }, produces = {"application/json" })
	public CardDetails updateCardDetails(@RequestBody CardDetails card) {
		
		
		return cardserv.updateCardDetails(card);
		
	}
	
	@GetMapping(path= "/getministatement", produces = {"application/json" })
       public List<SavingsAccount> ministatement(){
		
		
		
		
		return savingsservice.ministatement();
		
	}
	
	@GetMapping(path= "/getstatement",produces = {"application/json" })
    public List<SavingsAccount> statement(){
		
		
		
		
		return savingsservice.statement();
		
	}
	

	@PostMapping(path= "/addwifibill",consumes = {  "application/json" }, produces = {"application/json" })
	public WifiBill addBill(@RequestBody WifiBill bill) {
		
		
		return wifibillservice.addBill(bill);
		
	}
	
	@PostMapping(path= "/addDTHpayment",consumes = {  "application/json" }, produces = {"application/json" })
	public DTHPayment addPayment(@RequestBody DTHPayment payment) {
		
		
		return dthpaymentservice.addpayment(payment);
		
	}
	
	
	
	
	


	

}
