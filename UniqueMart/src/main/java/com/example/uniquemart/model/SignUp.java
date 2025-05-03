package com.example.uniquemart.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class SignUp {
	 @Id
//     @GeneratedValue
	 @SequenceGenerator(name="seqTest",sequenceName="TEST_SEQ" , initialValue = 101)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTest")
      private int id;
	   

	    private String email, password;

		public SignUp() {
			super();
		}

		public SignUp(int id, String email, String password) {
			super();
			this.id = id;
			
			this.email = email;
			
			
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}



		

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	   
	    
	
}
