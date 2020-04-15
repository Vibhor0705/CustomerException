package org.cap.controller;

import java.util.List;

import org.cap.entities.Customer;

import org.cap.service.ICustomerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    private static Logger Log= LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ICustomerService	customerService;


    /**
      this method will run on get request /hello
    **/
   

    @GetMapping("/find")
    public ModelAndView findPage() {
        return new ModelAndView("findcustomer");
    }


    @GetMapping("/processfindcustomer")
    public ModelAndView customerDetails(@RequestParam("cid")int cid) {
        Customer customer= customerService.findById(cid);
        return new ModelAndView("customerdetails", "customer", customer);
    }

    @GetMapping("/delete")
    public ModelAndView deletePage() {
        return new ModelAndView("deletecustomer");
    }
    @GetMapping("/processdeletecustomer")
    public ModelAndView cusDetails(@RequestParam("cid")int cid) {
        Boolean isDelete= customerService.delete(cid);
        return new ModelAndView("deletedetails");
    }

    @GetMapping("/register")
    public ModelAndView registerPage() {
        return new ModelAndView("customerregister");// only provide view name
    }

    @GetMapping("/processregister")
    public ModelAndView registerEmployee(@RequestParam("cname") String cname) {
        Customer customer = new Customer();
        customer.setCname(cname);
        customer=customerService.register(customer);
        return new ModelAndView("customerdetails",  "customer", customer);
    }
    @GetMapping("/update")
    public ModelAndView updatePage() {
        return new ModelAndView("updatedetails");
    }
    @GetMapping("/processupdate")
    public ModelAndView updateEmployee(@RequestParam("cname") String cname,@RequestParam("cid") int cid) {
        Customer customer = new Customer();
        customer.setCname(cname);
        customer.setCid(cid);
        customer=customerService.update(customer);
        return new ModelAndView("customerdetails",  "customer", customer);
    }
    @GetMapping("/fetchall")
    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
    public ModelAndView fetchallCustomer() {
    	 List <Customer> store1=customerService.fetchAll();
        return new ModelAndView("fetchall","fetch",store1);
    }

}
