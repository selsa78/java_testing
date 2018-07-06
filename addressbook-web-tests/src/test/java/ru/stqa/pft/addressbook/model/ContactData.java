package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private final String fname;
  private final String lname;
  private final String mobile;
  private final String email;
  private String group;

  @Override
  public String toString() {
    return "ContactData{" +
            "fname='" + fname + '\'' +
            ", lname='" + lname + '\'' +
            ", mobile='" + mobile + '\'' +
            ", email='" + email + '\'' +
            ", group='" + group + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(fname, that.fname) &&
            Objects.equals(lname, that.lname) &&
            Objects.equals(mobile, that.mobile) &&
            Objects.equals(email, that.email) &&
            Objects.equals(group, that.group);
  }

  @Override
  public int hashCode() {

    return Objects.hash(fname, lname, mobile, email, group);
  }

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
