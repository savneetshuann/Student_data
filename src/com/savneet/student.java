package com.savneet;

import java.util.Date;

public class student {
    private int studentId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender; //Enum
    private String address;
    private String city;
    private String pinCode;
    private String cellPhone;
    private String email;
    private String department;
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String grade;

    public student(int studentId, String firstName, String lastName, Date birthDate, Gender gender, String address, String city, String pinCode, String cellPhone, String email, String department, float[] marks, float totalMarks, float percentage, String grade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
        this.cellPhone = cellPhone;
        this.email = email;
        this.department = department;
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
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

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void calculateTotalMarks(){
        float total=0.0f;
        for (int i=0;i<marks.length;i++)
        {
            total +=marks[i];

        }
        setTotalMarks(total);

    }
    public void calculatePercentage(){
        


    }
    public void calculateGrade(){

    }
}
