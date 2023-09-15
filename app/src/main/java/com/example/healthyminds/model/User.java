package com.example.healthyminds.model;

public class User {
    String profilePic, phoneNum, fullName, email, password, uid;

    public  User(String email, String password)
    {
        this.email = email;
        this.password = password;

        this.profilePic = "";
        this.phoneNum = "";
        this.fullName = "";

    }

    public User(String profilePic, String phoneNum, String fullName, String email, String password, String uid) {
        this.profilePic = profilePic;
        this.phoneNum = phoneNum;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.uid = uid;
    }



    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
