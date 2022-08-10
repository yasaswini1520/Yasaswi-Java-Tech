package com.hexaware.practice.seller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerExample {
	
		List<CSeller> list = new ArrayList<CSeller>();
		public void addDetails()
		{
			
		list.add(new CSeller(1,"Ramesh","ramesh01@gmail.com","Karnataka"));
		list.add(new CSeller(2,"Suresh","suresh02@gmail.com","Chennai"));
		list.add(new CSeller(3,"Rakesh","rakesh03@gmail.com","Hyderabad"));
		list.add(new CSeller(4,"Neeraj","neeraj04@gmail.com","Banglore"));
		
		list.forEach((CSeller)->{
			System.out.println("Seller Id : "+CSeller.getSid());
			System.out.println("Seller Name : "+CSeller.getSname());
			System.out.println("Seller E-Mail : "+CSeller.getSmail());
			System.out.println("Seller Location : "+CSeller.getSloc());
		});
		}
		public void display() {
			list.stream().forEach((CSeller) -> System.out.println(CSeller));
		}
		public void addSeller(int sid, String sname, String smail, String sloc) {
			CSeller data = new CSeller(sid,sname, smail, sloc);
			list.add(data);
			System.out.println("New Seller Added");
			display();
		}
		
		
		public void searchById(int id) {
			list.stream()
			.filter((CSeller) -> id == CSeller.getSid())
			.forEach((CSeller) -> System.out.println(CSeller));
		}
		
		
		public void deleteById(int id) {
			
			list =  (ArrayList<CSeller>) list.stream()
			.filter((CSeller) -> id != CSeller.getSid())
			.collect(Collectors.toList());
			
			list.stream()
			.forEach((CSeller) -> System.out.println(CSeller));
		}
		
		public void updateById(int sid, String sname, String sloc, String smail) {
			 list.stream().filter((CSeller) -> sid == CSeller.getSid())
			.forEach((CSeller) -> {
				CSeller.setSid(sid);
				CSeller.setSname(sname);
				CSeller.setSmail(smail);
				CSeller.setSloc(sloc);
			});
			
			list.stream().forEach((CSeller) -> System.out.println(CSeller));

		}
		
		public void displayByLoc(String loc) {
			list.stream().filter((CSeller) -> loc.equals(CSeller.getSloc()))
			.forEach((CSeller) -> System.out.println(CSeller));
		}
		
	}


