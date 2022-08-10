package com.hexaware.practice.seller;

import java.util.Scanner;
public class CSeller
	{
		private int sid;
		private String sname,smail,sloc;
		CSeller(int sid,String sname,String smail,String sloc)
		{
			this.sid=sid;
			this.sname=sname;
			this.smail=smail;
			this.sloc=sloc;
		}
		
		public int getSid()
		{
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname()
		{
			return sname;
		}
		public void setSname(String Sname) {
			this.sname = sname;
		}
		public String getSmail()
		{
			return smail;
		}
		public void setSmail(String Smail) {
			this.smail = smail;
		}
		public String getSloc()
		{
			return sloc;
		}
		public void setSloc(String Sloc) {
			this.sloc = sloc;
		}
		public String toString()
		{
			return "Seller ID :"+sid+",Seller Name :"+sname+",Seller Mail : "+smail+",Seller Location : "+sloc;
		}
	}


