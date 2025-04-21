package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

@Entity

public class registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min = 3)
	private String Firstname;
	@NotNull
	@Size(min = 3)
	private String LastName;
	@NotNull
	@Size(min = 8)
	private String Username;
	@NotNull
	@Email
	private String Email;
	@NotNull
	@Size(min = 10, max = 10)
	private long PhoneNumber;
	@NotNull
	private boolean Gender;
	@NotNull
	@Size(min = 8, max = 12)
	private String Password;
	@NotNull
	@Size(min = 8, max = 12)
	private String ConfirmPassword;
//	@ManyToOne
//	private orders order;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public boolean isGender() {
		return Gender;
	}
	public void setGender(boolean gender) {
		Gender = gender;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public registration(long id, String firstname, String lastName, String username, String email, long phoneNumber,
			boolean gender, String password, String confirmPassword) {
		super();
		this.id = id;
		Firstname = firstname;
		LastName = lastName;
		Username = username;
		Email = email;
		PhoneNumber = phoneNumber;
		Gender = gender;
		Password = password;
		ConfirmPassword = confirmPassword;
	}
	

}
