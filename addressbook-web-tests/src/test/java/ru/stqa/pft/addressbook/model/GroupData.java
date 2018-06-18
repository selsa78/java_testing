package ru.stqa.pft.addressbook.model;

public class GroupData {      //объект, у которого три атрибута
  private final String name;
  private final String header;
  private final String footer;

  public GroupData(String name, String header, String footer) {   //конструктор, который позволяет проинициализировать объект значениями
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  public String getName() {
    return name;
  }   //три метода, которые возвращают атрибуты

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }
}
