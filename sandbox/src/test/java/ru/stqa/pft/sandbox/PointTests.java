package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testPoint1(){
    Point p1 = new Point(1, 1);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p1.distance(p2), 2.23606797749979);
  }
  @Test
  public void testPoint2() {
    Point p1 = new Point(2, 5);
    Point p2 = new Point(8, 34);
    Assert.assertEquals(p1.distance(p2), 29.614185789921695);
  }

  @Test
  public void testPoint3() {
    Point p1 = new Point(2, 5);
    Point p2 = new Point(8, 34);
    Assert.assertNotEquals(p1.distance(p2), -29.614185789921695);
  }
}
