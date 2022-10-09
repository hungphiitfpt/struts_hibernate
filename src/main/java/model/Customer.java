package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;

public class Customer implements java.io.Serializable {

	private long customerId;
	private String name;
	private String address;
	private Date createdDate;

	public Customer() {
	}

	public Customer(long customerId, String name, String address,
			Date createdDate) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.createdDate = createdDate;
	}

	public long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	  public static void main(String[] args) {

		    Connection dbConnection = null;

		    try {
		      String url = "jdbc:mysql://localhost:3306/mkyong?characterEncoding=latin1";
		      Properties info = new Properties();
		      info.put("user", "root");
		      info.put("password", "nguyen12a10");

		      dbConnection = DriverManager.getConnection(url, info);
		      
		      if (dbConnection != null) {
		        System.out.println("Successfully connected to MySQL database test");
		      }

		    } catch (SQLException ex) {
		      System.out.println("An error occurred while connecting MySQL databse");
		      ex.printStackTrace();
		    }

		  }

}
