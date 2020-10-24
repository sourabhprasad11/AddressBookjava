package addressbookmanage;


public class Person {
	  public final String firstname;
	  public final String lastname;
	  public final long phone;
	  public final int zipcode;
	  //public final String address;
	  public final String city;
	  public final String state;


public Person(String firstname,String lastname,long phone, int zipcode,String city ,String state){
	
	  //super();
	  this.firstname=firstname;
	  this.lastname=lastname;
	  this.phone=phone;
	  this.zipcode=zipcode;
	  this.city=city; 
	  this.state=state;

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
	

}

