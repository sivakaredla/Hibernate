package controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import models.registration;



public class registration_controller {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = md.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		registration r = new registration();
		System.out.println("Enter first name: ");
		String Firstname = src.next();
		r.setFirstname(Firstname);
		System.out.println("Enter last name: ");
		String Lastname = src.next();
		r.setLastName(Lastname);
		System.out.println("Enter user name: ");
		String Username = src.next();
		r.setUsername(Username);
		System.out.println("Enter emailid: ");
		String Email = src.next();
		r.setEmail(Email);
		System.out.println("Enter phone number: ");
		Long Phonenumber = src.nextLong();
		r.setPhoneNumber(Phonenumber);
		System.out.println("select gender: ");
		boolean Gender = src.nextBoolean();
		r.setGender(Gender);
		System.out.println("Enter password: ");
		String Password = src.next();
		r.setPassword(Password);
		System.out.println("Enter confirm password: ");
		String ConfirmPassword = src.next();
		r.setConfirmPassword(ConfirmPassword);
		
		s.save(r);
		t.commit();
		System.out.println("data successfully inserted..!");
		src.close();
	}

}
