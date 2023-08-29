package io.nology.employeeCreator.EmployeeCreator;

import java.time.LocalDate;

public class EmployeeDTO {
	String firstName;
	String middleName;
	String lastName;
	String email;
	String mobileNumber;
	String address;
	String contractType;
	LocalDate startDate;
	LocalDate finishDate;
	Boolean ongoing;
	String timeBasis;
	Long hours;
	
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO(String firstName, String middleName, String lastName, String email, String mobileNumber,
			String address, String contractType, LocalDate startDate, LocalDate finishDate, Boolean ongoing, String timeBasis,
			Long hours) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.contractType = contractType;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.ongoing = ongoing;
		this.timeBasis = timeBasis;
		this.hours = hours;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	public Boolean getOngoing() {
		return ongoing;
	}
	public void setOngoing(Boolean ongoing) {
		this.ongoing = ongoing;
	}
	public String getTimeBasis() {
		return timeBasis;
	}
	public void setTimeBasis(String timeBasis) {
		this.timeBasis = timeBasis;
	}
	public Long getHours() {
		return hours;
	}
	public void setHours(Long hours) {
		this.hours = hours;
	}
	
	
}
