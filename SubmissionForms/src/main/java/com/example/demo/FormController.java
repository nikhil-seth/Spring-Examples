package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
}
