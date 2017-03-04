package com.tbs.hello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.tbs.hello.entity.Address;
import com.tbs.hello.entity.Car;
import com.tbs.hello.entity.User;

@ManagedBean(name="userBean")
@SessionScoped
public class UserMBean {
	

	private static String PASSWORD_SIMPLE_USER="user";
	private static String LOGIN_SIMPLE_USER="user";
	private static String ERROR_PAGE="error.jsf";
	private static String USER_PAGE="welcome.jsf";
	
	
	
	
	public UserMBean(){
		this.user = new User();
	}
	
	private User user;
	
	
	public void connect(){
		
		
		
      if(LOGIN_SIMPLE_USER.equals(this.user.getLogin()) && PASSWORD_SIMPLE_USER.equals(this.user.getPassword())){
    	  initUser();
    	  redirect(USER_PAGE);
		}else{
			redirect(ERROR_PAGE);
		}
		
		
		
	}

	private void initUser() {
		this.user.setDateOfBirth(new Date());
		this.user.setFirstName("med");
		this.user.setId(1l);
		this.user.setLastName("ali");
		this.user.setMail("med.ali@tbs.com");
		
		Address address = new Address();
		address.setId(12l);
		address.setCountrie("Tunisie");
		address.setPostalCode(1001);
		address.setStreet("EL mourouj 4");
		address.setDepartment("Ben arous");
		
		this.user.setAddress(address);
		
		
		List<Car> listCars = new ArrayList<Car>();
		Car bmw = new Car();
		bmw.setColor("BLACK");
		bmw.setDateOfConstruction(new Date());
		bmw.setMark("BMW");
		bmw.setId(1l);
		bmw.setSerialNumber("190 tunis 1234");
		
		Car mercedes = new Car();
		mercedes.setColor("RED");
		mercedes.setDateOfConstruction(new Date());
		mercedes.setMark("MERCEDES BENZ");
		mercedes.setId(2l);
		mercedes.setSerialNumber("191 tunis 1234");
		
		listCars.add(bmw);
		listCars.add(mercedes);
		
		this.user.setCars(listCars);
		
		
		
		
	}
	
	/**
	 * Redirect to pageName
	 * 
	 * @param pageName
	 */

	public void redirect(String pageName){
		
		

		try {
			FacesContext fc = FacesContext.getCurrentInstance();
			ExternalContext ec = fc.getExternalContext();
	        ec.redirect(pageName);
	   } catch (IOException ex) {
	        Logger.getLogger(UserMBean.class.getName()).log(Level.SEVERE, null, ex);
	  }
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
