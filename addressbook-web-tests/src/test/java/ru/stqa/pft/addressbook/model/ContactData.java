package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private int id;
  private final String fname;
  private final String lname;
  private final String mobile;
  private final String email;
  private String group;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(fname, that.fname) &&
            Objects.equals(lname, that.lname);
  }

  @Override
  public int hashCode() {

    return Objects.hash(fname, lname);
  }

  public void setId(int id) {

    this.id = id;
  }

  public ContactData(String fname, String lname, String mobile, String email, String group) {
    this.id = Integer.MAX_VALUE;
    this.fname = fname;
    this.lname = lname;
    this.mobile = mobile;
    this.email = email;
    this.group = group;
  }

  public ContactData(int id, String fname, String lname, String mobile, String email, String group) {
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.mobile = mobile;
    this.email = email;
    this.group = group;
  }

  public int getId() { return id; }

  public String getFname() { return fname; }

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

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", fname='" + fname + '\'' +
            ", lname='" + lname + '\'' +
            ", mobile='" + mobile + '\'' +
            ", email='" + email + '\'' +
            ", group='" + group + '\'' +
            '}';
  }
}
