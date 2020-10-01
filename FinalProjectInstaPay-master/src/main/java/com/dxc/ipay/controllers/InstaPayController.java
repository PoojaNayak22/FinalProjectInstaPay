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
import com.dxc.ipay.entites.Balance;
import com.dxc.ipay.entites.CardDetails;
import com.dxc.ipay.entites.DTHPayment;
import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.entites.FundsDeposit;
import com.dxc.ipay.entites.Register;
import com.dxc.ipay.entites.ReoccurringAccount;
import com.dxc.ipay.entites.SavingsAccount;
import com.dxc.ipay.entites.ServiceProviders;
import com.dxc.ipay.entites.Transfer;
import com.dxc.ipay.entites.WifiBill;
import com.dxc.ipay.entites.Withdraw;
import com.dxc.ipay.services.IAccountDetailsService;
import com.dxc.ipay.services.IBalanceService;
import com.dxc.ipay.services.IBenificiaryDetailsService;
import com.dxc.ipay.services.ICardDetailsService;
import com.dxc.ipay.services.IDTHPaymentService;
import com.dxc.ipay.services.IFixedDepositService;
import com.dxc.ipay.services.IFundsDepositService;
import com.dxc.ipay.services.IRegisterService;
import com.dxc.ipay.services.IReoccurringAccountService;
import com.dxc.ipay.services.ISavingsAccountService;
import com.dxc.ipay.services.IServiceProvidersService;
import com.dxc.ipay.services.ITransferService;
import com.dxc.ipay.services.IWifiBillService;
import com.dxc.ipay.services.IWithdrawService;


@RestController //Controller + RequestBody
@RequestMapping(path = "/ipay") 
@CrossOrigin("http://localhost:4200")
public class InstaPayController {
	
	
	
	@Autowired
	ITransferService service;
	
	/*
	 * @Autowired AdminSite admin;
	 */
	
	
	
	@Autowired
	IReoccurringAccountService reocurringservice;
	
	
	@Autowired
	IFixedDepositService fixedservice;
	
	@Autowired
	IRegisterService registerservice;
	
	@Autowired
	IAccountDetailsService accountservice;
	
	@Autowired
	IBenificiaryDetailsService benificiaryservice;
	
	@Autowired
	ICardDetailsService cardservice;

	
	@Autowired
	ISavingsAccountService savingsservice;
	
	@Autowired
	IWifiBillService wifibillservice;
	
	@Autowired
	IDTHPaymentService dthpaymentservice;
	
	@Autowired
	IFundsDepositService depositservice;
	
	@Autowired
	IServiceProvidersService providerservice;
	
	@Autowired
	IWithdrawService withdrawservice;
	
	@Autowired
	IBalanceService balanceservice;
	
	
	
  
	@PostMapping(path= "/send",consumes = {  "application/json" }, produces = {"application/json" })
	public Transfer addTransfer(@RequestBody Transfer transfer) {
		
		//Calling addTransfer method of   ITransferService using service reference
		
		return service.addTransfer(transfer);
		
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
	
	@PostMapping(path= "/fundsDeposit",consumes = {  "application/json" }, produces = {"application/json" })
	public FundsDeposit addDeposit(@RequestBody FundsDeposit funds) {
		
		//Calling addpayment method of FundsDeposit using dthpaymentservice. reference
		
		
		
		return depositservice.addDeposit(funds);
		
	}
	
	@PostMapping(path= "/serviceProviders",consumes = {  "application/json" }, produces = {"application/json" })
	public ServiceProviders addProviders(@RequestBody ServiceProviders providers) {
		
		//Calling addpayment method of FundsDeposit using dthpaymentservice. reference
		
		
		
		return providerservice.addProviders(providers);
		
	}
	@PostMapping(path= "/withdraw",consumes = {  "application/json" }, produces = {"application/json" })
	public Withdraw debitMoney(@RequestBody Withdraw withdraw) {
		
		//Calling addpayment method of FundsDeposit using dthpaymentservice. reference
		
		
		
		return withdrawservice.debitMoney(withdraw);
		
	}
	@GetMapping(path= "/getbalance",produces = {"application/json" })
    public List<Balance> getBalance(){
		
		
		
		//Calling statement method of  ISavingsAccountService using savingsservice reference
		
		
		return balanceservice.getBalance();
		
	}
	
	
	
	
	
	
	


	

}
