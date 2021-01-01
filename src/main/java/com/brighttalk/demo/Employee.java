package com.brighttalk.demo;

public class Employee {

    /*
    * 	`id`	bigint(20)	NOT	NULL	AUTO_INCREMENT,
		`first_name`	varchar(45)	DEFAULT	NULL,
		`last_name`	varchar(45)	DEFAULT	NULL,
		`email`	varchar(45)	DEFAULT	NULL,
		`phone`	varchar(45)	DEFAULT	NULL
		*
		* */

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, String emailId,String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emailId;
        this.phone = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + email + '\'' +
                ", phoneNumber='" + phone + '\'' +
                '}';
    }

}
