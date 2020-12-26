	package com.gp.spring.springcoreadvanced.autowiring.annotation;
	
	public class Address {
		private int hno;
		private String city;
		private String street;
		public int getHno() {
			return hno;
		}
		public void setHno(int hno) {
			this.hno = hno;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		@Override
		public String toString() {
			return "Address [hno=" + hno + ", city=" + city + ", street=" + street + "]";
		}
	
	}
