package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {
	@Autowired
	CustomersRepo repo;
	@RequestMapping("/")
	public String edureka() {
		return "edureka";
	}
	// When site is loaded, edureka.jsp is given
	@RequestMapping("/details")
	public String details(Customers customer){
		repo.save(customer);
		return "edureka";
	}
	// When this is called, data is retrieved & saved in DB & it returns back edureka.
	@RequestMapping("/getdetails")
	public String getdetails() {
		return "ViewCustomers";
	}
@PostMapping("/getdetails")
// Once Done with URL
public ModelAndView viewDetails(@RequestParam("cid") int cid) {
	ModelAndView mv=new ModelAndView("Retrieve");
	Customers customers=repo.findById(cid).orElse(null);
	mv.addObject(customers);
	return mv;
}
@RequestMapping("/customers")
@ResponseBody
public List<Customers> getCustomers() {
	// List Hone seh it returns json format.
	return repo.findAll();
}
@RequestMapping("/customers/{cid}")
@ResponseBody
public Optional<Customers> getCustomers(@PathVariable("cid") int cid) {
	return repo.findById(cid);
}

//Remove this, as we don't want anything@ResponseBody
@DeleteMapping("/customers/{cid}")
public Customers getCustomer3(@PathVariable("cid") int cid) {
	Customers cust=repo.getOne(cid);
	repo.delete(cust);
	return cust;
}
@PutMapping(path="/customers", consumes = {"application/json"})
public Customers getCustomer5(@RequestBody Customers cust) {
	repo.save(cust);
	return cust;
}
}