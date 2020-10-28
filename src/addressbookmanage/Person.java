package addressbookmanage;


public class Person {
	  public String firstname;
	  public String lastname;
	  public long phone;
	  public int zipcode;
	  public String city;
	  public String state;



public Person(String firstname,String lastname,long phone, int zipcode,String city ,String state){

	  this.firstname=firstname;
	  this.lastname=lastname;
	  this.phone=phone;
	  this.zipcode=zipcode;
	  this.city=city; 
	  this.state=state;

}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public void setPhone(long phone) {
	this.phone = phone;
}


public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}


public void setCity(String city) {
	this.city = city;
}


public void setState(String state) {
	this.state = state;
}


public String getFirstname() {
	return firstname;
}

public String getLastname() {
	return lastname;
}

public long getPhone() {
	return phone;
}

public int getZipcode() {
	return zipcode;
}

public String getCity() {
	return city;
}

public String getState() {
	return state;
}


@Override
public String toString() {
	return "Person [firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + ", zipcode=" + zipcode
			+ ", city=" + city + ", state=" + state + "]";
}

}

