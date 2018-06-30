package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String fname;
  private final String lname;
  private final String mobile;
  private final String email;
  private String group;

  public ContactData(String fname, String lname, String mobile, String email, String group) {
    this.fname = fname;
    this.lname = lname;
    this.mobile = mobile;
    this.email = email;
    this.group = group;
  }

  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }
}
