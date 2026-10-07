/**
 * A rectangle with a width and a height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a rectangle with the given dimensions.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the width multiplied by the height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions of this rectangle by the given factor.
   *
   * @param factor the amount to multiply the width and height by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than another.
   *
   * @param other the rectangle to compare against
   * @return true if this rectangle's area exceeds other's area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
