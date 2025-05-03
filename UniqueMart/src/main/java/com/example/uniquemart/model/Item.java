package com.example.uniquemart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Item {
	
       @Id
//       @GeneratedValue
       @SequenceGenerator(name="seqTest",sequenceName="TEST_SEQ" , initialValue = 101)
   	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTest")
        private int id;
	    private String name;

	    private String description;
       @Column(name="imageUrl")
	    private String imageUrl;

		public Item() {
			super();
		}

		public Item(int id, String name, String description, String imageUrl) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.imageUrl = imageUrl;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
	    
}
