/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample.DTO;

import java.util.Date;




/**
 *
 * @author Phi Long
 */
public class UserDTO {
    private String userID ;   
    private String fullName ;
    private String email ;
    private String phone ;
    private String address ;
    private Date birthDay;
    private String citizenID;
    private String gender;
    private String password;
    private Date dateJoin;
    private boolean status;
    private int roleID;

    public UserDTO(String userID, String fullName, String email, String phone, String address, Date birthDay, String citizenID, String gender, String password, Date dateJoin, boolean status, int roleID) {
        this.userID = userID;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.birthDay = birthDay;
        this.citizenID = citizenID;
        this.gender = gender;
        this.password = password;
        this.dateJoin = dateJoin;
        this.status = status;
        this.roleID = roleID;
    }

    public UserDTO() {
        this.userID = "";
        this.fullName = "";
        this.email = "";
        this.phone = "";
        this.address = "";
        this.birthDay = null;
        this.citizenID = "";
        this.gender = "";
        this.password = "";
        this.dateJoin = null;
        this.status = false;
        this.roleID = 0;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(Date dateJoin) {
        this.dateJoin = dateJoin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
    
}
