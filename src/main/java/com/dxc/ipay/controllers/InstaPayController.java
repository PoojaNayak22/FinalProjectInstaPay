/*This is the MainController of the application,
  All the respective Models and Service classes are  Autowired */

package com.dxc.ipay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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


@RestController //Controller + RequestBody
@RequestMapping(path = "/ipay") 
@CrossOrigin("http://localhost:4200")
public class InstaPayController {
	
	@Autowired
	Transfer transfer;
	
	@Autowired
	ITransferService service;
	
	@Autowired
	AdminSite admin;
	
	@Autowired
	IAdminSiteService adminservice;
	
	@Autowired
	ReoccurringAccount reocurring;
	
	@Autowired
	IReoccurringAccountService reocurringservice;
	
	@Autowired
	FixedDeposit fixed;
	
	@Autowired
	IFixedDepositService fixedservice;
	
	@Autowired
	Register register;
	
	@Autowired
	IRegisterService registerservice;
	
	@Autowired
	AccountDetails account;
	
	@Autowired
	IAccountDetailsService accountservice;
	
	@Autowired
	IBenificiaryDetailsService benificiaryservice;
	
	@Autowired
	CardDetails card;
	
	@Autowired
	ICardDetailsService cardservice;
	
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
		
		//Calling addTransfer method of   ITransferService using service reference
		
		return service.addTransfer(transfer);
		
	}
	
	@PostMapping(path= "/add",consumes = {  "application/json" }, produces = {"application/json" })
	public AdminSite addRequest(@RequestBody AdminSite admin) {
		
		//Calling addRequest method of   ITransferService using adminservice reference
		
		return adminservice.addRequest(admin);
		
	}

	@PutMapping(path= "/update",consumes = {  "application/json" }, produces = {"application/json" })
	public AdminSite updateRequest(@RequestBody AdminSite admin) {
		
		//Calling updateRequest method of   ITransferService using adminservice reference
		
		return adminservice.updateRequest(admin);
		
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int userId) {

		//Calling deleteRequest method of   ITransferService using adminservice reference
		
		adminservice.deleteRequest(userId);

		return "Request deleted with userId  " + userId;

	}
	
	@PostMapping(path= "/reocurring",consumes = {  "application/json" }, produces = {"application/json" })
	public ReoccurringAccount addMoney(@RequestBody ReoccurringAccount recurr) {
		
		//Calling addAmount method of   IReoccurringAccountService using reocurringservice reference
		
		return reocurringservice.addAmount(recurr);
		
	}
	
	@PostMapping(path= "/fixed",consumes = {  "application/json" }, produces = {"application/json" })
	public FixedDeposit  addAmount(@RequestBody FixedDeposit fixed) {
		
		//Calling addAmount method of   IFixedDepositService using fixedservice reference
		
		return fixedservice.addAmount(fixed);
		
	}

	@PostMapping(path= "/register",consumes = {  "application/json" }, produces = {"application/json" })
	public Register addCustomer(@RequestBody Register register) {
		
		//Calling addCustomer method of   IRegisterService using  registerservice reference
		
		return registerservice.addCustomer(register);
		
	}
	
	@PostMapping(path= "/addAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails addDetails(@RequestBody AccountDetails account) {
		
		//Calling addDetails method of   IAccountDetailsService  using  accountservice reference
		
		return accountservice.addDetails(account);
		
	}

	@PutMapping(path= "/updateAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails updateDetails(@RequestBody AccountDetails account) {
		
		//Calling updateDetails method of   IAccountDetailsService  using  accountservice reference
		
		
		return accountservice.updateDetails(account);
		
	}
	
	@PostMapping(path= "/addBenificiaryAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails addBenificiaryDetails(@RequestBody AccountDetails account) {
		

		//Calling addBenificiaryDetails method of   IAccountDetailsService  using benificiaryservice reference
		
		
		return benificiaryservice.addBenificiaryDetails(account);
		
	}

	@PutMapping(path= "/updateBenificiaryAccount",consumes = {  "application/json" }, produces = {"application/json" })
	public AccountDetails updateBenificiaryDetails(@RequestBody AccountDetails account) {
		

		//Calling updateBenificiaryDetails method of   IAccountDetailsService  using benificiaryservice reference
		
		return benificiaryservice.updateBenificiaryDetails(account);
		
	}
	
	@PostMapping(path= "/addCardDetails",consumes = {  "application/json" }, produces = {"application/json" })
	public CardDetails addCardDetails(@RequestBody CardDetails card) {
		
		//Calling addCardDetails method of   ICardDetailsService using cardservice reference
		
		
		return cardservice.addCardDetails(card);
		
	}

	@PutMapping(path= "/updateCardDetails",consumes = {  "application/json" }, produces = {"application/json" })
	public CardDetails updateCardDetails(@RequestBody CardDetails card) {
		
		//Calling updateCardDetails method of   ICardDetailsService using cardservice reference
		
		return cardservice.updateCardDetails(card);
		
	}
	
	@GetMapping(path= "/getministatement", produces = {"application/json" })
       public List<SavingsAccount> ministatement(){
		
		
		//Calling ministatement method of  ISavingsAccountService using savingsservice reference
		
		
		return savingsservice.ministatement();
		
	}
	
	@GetMapping(path= "/getstatement",produces = {"application/json" })
    public List<SavingsAccount> statement(){
		
		
		
		//Calling statement method of  ISavingsAccountService using savingsservice reference
		
		
		return savingsservice.statement();
		
	}
	

	@PostMapping(path= "/addwifibill",consumes = {  "application/json" }, produces = {"application/json" })
	public WifiBill addBill(@RequestBody WifiBill bill) {
		
		//Calling addBill method of  IWifiBillService using wifibillservice reference
		
		
		
		return wifibillservice.addBill(bill);
		
	}
	
	@PostMapping(path= "/addDTHpayment",consumes = {  "application/json" }, produces = {"application/json" })
	public DTHPayment addPayment(@RequestBody DTHPayment payment) {
		
		//Calling addpayment method of IDTHPaymentService using dthpaymentservice. reference
		
		
		
		return dthpaymentservice.addpayment(payment);
		
	}
	
	
	
	
	


	

}
