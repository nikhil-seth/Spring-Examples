package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custid;
    private String custname;
    private String courseName;
    @Autowired
    private Technologies techdetail;

    public Technologies getTechdetail() {
        return this.techdetail;
    }

    public void setTechdetail(Technologies techdetail) {
        this.techdetail = techdetail;
    }

	public int getCustid() {
		return this.custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
    }
    public void display(){
        System.out.println("Customers Object Returned Successfully");
        techdetail.tech();
    }
    
}